package Homework.Lesson12.documentProcessingValidation;

import java.io.*;
import java.util.*;

/*Архитектурные шаги и требования:
1 Считывание путей к файлам:
Программа считывает с консоли пути к файлам. Каждая новая строка — путь к файлу и его имя.
Ввод прекращается при вводе символа 0.
Все пути сохраняются в коллекцию типа List (используйте ArrayList).
2 Считывание и дедупликация номеров документов:
Файлы содержат по одному номеру документа на строку (без посторонней информации).
Номера документов могут повторяться как в пределах одного файла, так и между разными файлами.
Чтобы исключить повторную валидацию дубликатов, все считанные номера сохраняйте в коллекцию типа Set
(используйте HashSet).
3 Правила валидации:
Номер документа валиден, если его длина строго 15 символов и он начинается с последовательности
 docnum или kontract (далее любая последовательность букв/цифр).
В противном случае номер считается невалидным (с указанием конкретной причины).
4 Формирование отчета:
Результаты проверки сохраняются в структуру Map (используйте HashMap), где:
Ключ: номер документа.
Значение: статус и комментарий (валиден / не валиден и по какой причине).
В конце работы программы пройдите циклом по этой Map и запишите всю информацию в итоговый файл-отчет.*/


public class ReadingFile {

    public static Set<String> readAndDuplicate(List<String> filePaths) {
        Set<String> docNumbers = new HashSet<>();

        for (String path : filePaths){
            File file = new File(path);

            if (!file.exists() || !file.isFile()) {
                System.out.println("Файл не найден");
                continue;
            }

            try (BufferedReader reader = new BufferedReader(new FileReader(file))){
                String line;
                while ((line = reader.readLine()) != null){
                    String docNum = line.trim();
                    if (!docNum.isEmpty()) {
                        docNumbers.add(docNum);
                    }
                }
            } catch (IOException e){
                System.out.println("Ошибка чтения файла " + path + ": " + e.getMessage());
            }
        }
        System.out.println("Успешно считано номеров: " + docNumbers.size());
        return docNumbers;
    }

    public static void writeReport(Map<String, String> reportMap, String targetFileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(targetFileName))) {
            writer.write("Дата формирования " + new Date());

            for (Map.Entry<String, String> entry : reportMap.entrySet()) {
                String row = String.format("Документ : %-18s | Статус: %s\n", entry.getKey(), entry.getValue());
                writer.write(row);
            }

            System.out.println("Успешно сохранен в: " + targetFileName);
        }catch (IOException e){
            System.out.println("Ошибка при записи отчета: " + e.getMessage());
        }
    }
}
