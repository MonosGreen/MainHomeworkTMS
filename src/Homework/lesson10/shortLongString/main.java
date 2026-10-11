package Homework.lesson10.shortLongString;

public class main {
    public static void main(String[] args) {

        String inputString = "Стол, стул, арбуз, цветы, фиолетовый, вентилятор, лом";
        System.out.println("Исходная строка: " + inputString);

        ShortAndLongString.findShortAndLongString(inputString);
    }
}
