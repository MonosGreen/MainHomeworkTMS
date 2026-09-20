package HomeworkLesson7.TaskPosition;

public class Main {
    static void main() {
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();
        Employee[] staff = new Employee[3];
        staff[0] = director;
        staff[1] = worker;
        staff[2] = accountant;

        for (Employee employee : staff) {
            employee.printPosition();
        }
    }
}
