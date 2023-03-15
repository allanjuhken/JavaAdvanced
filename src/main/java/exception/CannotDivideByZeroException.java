package exception;

public class CannotDivideByZeroException extends RuntimeException{
    public CannotDivideByZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}
