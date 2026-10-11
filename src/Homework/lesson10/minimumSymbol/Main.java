package Homework.lesson10.minimumSymbol;

/*Дана строка произвольной длины с произвольными словами.

Найти слово, в котором число различных символов минимально.
Слово может содержать как буквы, так и цифры.
Если таких слов несколько — найти первое из них.
Пример: Для строки "fffff ab f 1234 jkjk" искомым словом будет "fffff" (или "f").*/

public class Main {

    static void main() {

        String text = "qwertyuiop aassddffgg 231232 aaaaaas fghjfghjfghj";
        String[] words = text.split("\\s+");

        WordAnalyzer analyzer = new WordAnalyzer();

        String resultWord = "";
        int minValueCount = Integer.MAX_VALUE;

        for (String word : words) {
            int currentUniqueCount = analyzer.uniqueCharacters(word);
            if (currentUniqueCount < minValueCount) {
                minValueCount = currentUniqueCount;
                resultWord = word;
            }
        }

        System.out.println("Искомое слово: " + resultWord);
    }

}
