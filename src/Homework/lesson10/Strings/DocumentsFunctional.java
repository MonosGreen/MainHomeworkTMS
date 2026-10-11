package Homework.lesson10.Strings;

import java.util.Locale;

/**Формат документа:** `xxxx-yyy-xxxx-yyy-xyxy`, где `x` — цифра, а `y` — буква.

 **Требования к функционалу:**
 1. Вывести на экран в одну строку два первых блока по 4 цифры.
 2. Вывести на экран номер документа, заменив блоки из трех букв на `***` (каждая буква заменяется на `*`).
 3. Вывести на экран только буквы из номера документа в формате `yyy/yyy/y/y` в нижнем регистре.
 4. Вывести на экран буквы из номера документа в формате `"Letters:yyy/yyy/y/y"`
 в верхнем регистре (реализовать с помощью класса `StringBuilder`).
 5. Проверить, содержит ли номер документа последовательность `abc` (регистр не имеет значения: `abc` и `ABC`
 считаются одинаковой последовательностью), и вывести соответствующее сообщение.
 6. Проверить, начинается ли номер документа с последовательности `555`.
 7. Проверить, заканчивается ли номер документа на последовательность `1a2b`.*/

public class DocumentsFunctional {

    public static void printFirstBlocks(String docNumber){
        String[] blocks = docNumber.split("-");
        System.out.println("1. Выводим первые два блока с цифрами: " + blocks[0] + " - " + blocks[2]);
    }

    public static void maskStarLetterBlocks (String docNumber){
        String[] blocks = docNumber.split("-");
        blocks[1] = "***";
        blocks[3] = "***";
        System.out.println("2. Заменяем два блока с буквами на '*': " + docNumber);
    }

    public static void printLetterOnly( String docNumber){
        String[] blocks = docNumber.split("-");
        char lastB1 = blocks[4].charAt(1);
        char lastB2 = blocks[4].charAt(3);
        String result = blocks[1] + "/" + blocks[3] + "/" + lastB1 + "/" + lastB2;
        System.out.println("3. Выводим только буквы в нижнем регистре: " + result.toLowerCase());
    }

    public static void printLetterStringBinder( String docNumber){
        String[] blocks = docNumber.split("-");
        char lastB1 = blocks[4].charAt(1);
        char lastB2 = blocks[4].charAt(3);
        StringBuilder sb = new StringBuilder();
        sb.append("Letters:").append(blocks[1]).append("/").append(blocks[3]).append("/")
                .append(lastB1).append("/").append(lastB2);
        System.out.println("4. Выводим буквы через StringBilder в верхнем регистре: " + sb.toString().toUpperCase());
    }

    public static void checkContainsABC( String docNumber){
        if (docNumber.toUpperCase().contains("ABC")){
            System.out.println("5. Проверяем на наличие 'ABC': Да, в документе содержится последовательность 'ABC'");
        } else {
            System.out.println("5. Проверяем на наличие 'ABC': Нет, в документе не содержится последовательность 'ABC'");
        }
    }

    public static void checkStartsWith555( String docNumber){
        if (docNumber.startsWith("555")){
            System.out.println("6. Проверяем начинается ли документ с последовательности '555': Да, документ начинается с последовательности '555'");
        } else {
            System.out.println("6. Проверяем начинается ли документ с последовательности '555': Нет, документ не начинается с последовательности '555'");
        }
    }

    public static void chekEndWith1a2b( String docNumber){
        if (docNumber.endsWith("1a2b")){
            System.out.println("7. Проверяем оканчивается ли документ на последовательность '1a2b': Да, документ оканчивается на последовательность '1a2b'");
        } else {
            System.out.println("7. Проверяем оканчивается ли документ на последовательность '1a2b': Нет, документ не оканчивается на последовательность '1a2b'");
        }
    }
}
