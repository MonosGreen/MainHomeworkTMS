package Homework_Lesson_9.Exception;

public class DocumentException extends Exception {
    public DocumentException(String massage){
        super(massage);
    }
}

class MissingABC extends DocumentException{
    public MissingABC(String massage){
        super(massage);
    }
}

class Missing555 extends DocumentException{
    public Missing555(String massage){
        super(massage);
    }
}

class Missing1a2b extends DocumentException{
    public Missing1a2b(String massage){
        super(massage);
    }
}
