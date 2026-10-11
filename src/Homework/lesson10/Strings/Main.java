package Homework.lesson10.Strings;
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

public class Main {
    static void main() {
        String docNumber = "5555-aBc-6573-HgF-1a2b";

        System.out.println("Исходный документ: " + docNumber);
        System.out.println("");

        DocumentsFunctional.printFirstBlocks(docNumber);
        DocumentsFunctional.checkStartsWith555(docNumber);
        DocumentsFunctional.printLetterOnly(docNumber);
        DocumentsFunctional.printLetterStringBinder(docNumber);
        DocumentsFunctional.checkContainsABC(docNumber);
        DocumentsFunctional.checkStartsWith555(docNumber);
        DocumentsFunctional.chekEndWith1a2b(docNumber);
    }
}
