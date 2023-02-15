package Exception;

public class CreatingCustomException {


    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static int divide(int a, int b) throws CustomException {
        if (b == 0) {
            throw new CustomException("Division by zero not allowed");
        }
        return a / b;
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
