package exceptionsPractise;

public class CustomException extends Exception{
    public CustomException(String message){
        super("This is a customer expection");
    }
}
