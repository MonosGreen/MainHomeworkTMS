package Homework.Lesson12.documentProcessingValidation;

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

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> filePaths = ReadingFilePaths.getFilePaths();

        if (filePaths.isEmpty()) {
            System.out.println("Список путей пуст. Завершение работы.");
            return;
        }

        Set<String> uniqueDoc = ReadingFile.readAndDuplicate(filePaths);

        Map<String, String> validationReport = ValidationRules.validate(uniqueDoc);

        String outputReportName = "final_report.txt";
        ReadingFile.writeReport(validationReport, outputReportName);
    }
}
