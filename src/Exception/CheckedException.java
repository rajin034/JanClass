package Exception;import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckedException {

    public static void main(String[] args) {

        //io and file not found Exceptions
        try {
            FileReader file = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(file);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
        //parseException
        String dateString = "2023-02-15";
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = format.parse(dateString);
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("An error occurred while parsing the date: " + e.getMessage());
            e.printStackTrace();
        }
        //unchecked Arithmetic Exception
        int a = 10;
        int b = 0;


        try {
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

