package HomeworkLesson8.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("+385337488967", "Honor");
        Phone phone3 = new Phone("+375296785904", "Samsung", 250.5);

        phone1.number = "+375336401958";
        phone1.model = "iPhone";
        phone1.weight = 195.6;

        System.out.println("Телефон1: номер: " + phone1.number + ", Модель: " + phone1.model + ", Вес: " + phone1.weight);
        System.out.println("Телефон2: номер: " + phone2.number + ", Модель: " + phone2.model + ", Вес: " + phone2.weight);
        System.out.println("Телефон3: номер: " + phone3.number + ", Модель: " + phone3.model + ", Вес: " + phone3.weight);
        System.out.println(" ");

        phone1.receiveColl("Аня");
        System.out.println("Номер телефона 1: " + phone1.getNumber());
        System.out.println();

        phone2.receiveColl("Вася");
        System.out.println("Номер телефона 2: " + phone2.getNumber());
        System.out.println();

        phone3.receiveColl("Петя");
        System.out.println("Номер телефона 3: " + phone3.getNumber());
        System.out.println();

        System.out.println(" ");
        phone1.receiveColl("Соня", "+375447685765");
        System.out.println();

        System.out.println(" ");
        phone1.sendMessage("+375299384756", "+375334567890", "+375255242345");
        phone2.sendMessage("+375330988798");

    }
}
