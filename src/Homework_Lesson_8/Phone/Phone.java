package Homework_Lesson_8.Phone;

public class Phone {
    String number;
    String model;
    Double weight;

    public Phone() {

    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, Double weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveColl(String name){
        System.out.println("Звонит: " + name);
    }

    public void receiveColl(String name, String number){
        System.out.println("Звонит: " + name + " номер: " + number);
    }

    public String getNumber(){
        return this.number;
    }

    public void sendMessage(String... numbers){
        System.out.println("Отправляем сообщения на номера: ");
        for (String num : numbers){
            System.out.println(num);
        }
    }
}
