package Homework_Lesson_9.Exception;

public class DocumentValidator {
    public static void DocumentValidate(String documentNumber)
        throws MissingABC, Missing555, Missing1a2b{

        if (!documentNumber.contains("abc")){
            throw new MissingABC("Ошибка. Номер должен содержать 'abc'. ");
        }

        if (!documentNumber.startsWith("555")) {
            throw new Missing555("Ошибка. Номер должен начинаться с '555'.");
        }

        if (!documentNumber.endsWith("1a2b")){
            throw new Missing1a2b("Ошибка. Номер должен заканчиваться на '1a2b'");
        }

        System.out.println("Успех! в номере " + documentNumber + " нет ошибок.");
    }
}
