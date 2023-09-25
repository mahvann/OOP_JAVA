package Exeption;
class CustomCastException extends RuntimeException {

    public CustomCastException(String message) {
        super(message);
    }
}

class CustomCastExceptionDemo {
    public static Integer castToInteger(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        } else {
            throw new CustomCastException("Custom Cast Exception: Unable to cast to Integer");
        }
    }
}

public class CustomUnchecked {
    public static void main(String[] args) {
        try {
            Integer obj = 123;
            Integer num = CustomCastExceptionDemo.castToInteger(obj);
            System.out.println("Casting successful: " + num);
        } catch (CustomCastException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
