package Homework.lesson10.shortLongString;
/*Задание 2. Поиск самого короткого и самого длинного слова
Дана строка произвольной длины с произвольными словами.
* Найти самое короткое слово в строке и вывести его на экран.
* Найти самое длинное слово в строке и вывести его на экран.
* Если под условия подходит несколько слов — вывести **последнее** из них.*/

public class ShortAndLongString {
    public static void findShortAndLongString(String text) {
        String[] words = text.split(", ");

        String shortWords = words[0];
        String longsWords = words[0];

        for (int i = 1; i < words.length; i++) {
            String rightWords = words[i];

            if (rightWords.length() <= shortWords.length()) {
                shortWords = rightWords;
            }

            if (rightWords.length() >= longsWords.length()) {
                longsWords = rightWords;
            }
        }

        System.out.println("Самое короткое слово: " + shortWords);
        System.out.println("Самое длинное слово: " + longsWords);
    }
}
