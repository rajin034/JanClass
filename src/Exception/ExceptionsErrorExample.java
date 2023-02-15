package Exception;

public class ExceptionsErrorExample {
    public static void main(String[] args) {
        // Example of an error
        int[] array = new int[1000000000]; // This will cause an OutOfMemoryError because there is not enough memory to allocate the array

        // Example of an exception
        try {
            int result = divide(10, 0); // This will cause an ArithmeticException because you can't divide by zero
        } catch (ArithmeticException ex) {
            System.out.println("An exception occurred: " + ex.getMessage());
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}