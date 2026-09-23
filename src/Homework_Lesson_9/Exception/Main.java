package Homework_Lesson_9.Exception;

public class Main {
    static void main() {
        String[] testDocument= {
                "555_abc_1a2b",
                "555_qwe_1a2b",
                "123_abc_1a2b",
                "555_abc_7h8j"
        };

        for (String doc : testDocument){
            System.out.println("Проверяем документ: " + doc);

            try {
                DocumentValidator.DocumentValidate(doc);
            }
            catch (MissingABC e){
                System.out.println("Ошибка! В документе отсутствует фрагмент 'abc'.");
            }
            catch (Missing555 e){
                System.out.println("Ошибка! Документ начинается не с фрагмента '555'.");
            }
            catch (Missing1a2b e){
                System.out.println("Ошибка! Документ заканчивается не на фрагмент '1a2b'.");
            }
        }
    }
}
