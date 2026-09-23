package Homework_Lesson_7.TaskFigures;

public class Main {
    static void main() {
        Figures[] figures = new Figures[5];
        figures[0] = new Triangle(6, 4, 8);
        figures[1] = new Rectangle(9, 7);
        figures[2] = new Circle(8);
        figures[3] = new Triangle(2, 3, 4);
        figures[4] = new Rectangle(5, 7);

        int totalPerimeter = 0;
        for (Figures currontFigures : figures) {
            totalPerimeter += currontFigures.getPerimeter();
        }
        System.out.println("Сумма периметров всех фигур: " + totalPerimeter);
    }
}
