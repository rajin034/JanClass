package Exception;

public class MultipleCatch {


    public static void main(String[] args) {
        try {
            String str = null;
            str.charAt(1);
            int length = str.length();
            System.out.println("String length: " + length);
        } catch (NullPointerException e) {
            System.out.println("A null pointer exception occurred: " + e.getMessage());
            e.printStackTrace();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("A string index out of bounds exception occurred: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
