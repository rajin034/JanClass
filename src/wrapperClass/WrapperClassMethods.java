package wrapperClass;

public class WrapperClassMethods {
    public static void main(String[] args) {
        // using Integer wrapper class
        int age = 30;
        Integer ageWrapper = Integer.valueOf(age);
        System.out.println("Age: " + ageWrapper);
        System.out.println("Age in binary: " + Integer.toBinaryString(ageWrapper));
        System.out.println("Age in hexadecimal: " + Integer.toHexString(ageWrapper));
        System.out.println("Age in octal: " + Integer.toOctalString(ageWrapper));

        // using Double wrapper class
        double pi = 3.141592653589793238;
        Double piWrapper = Double.valueOf(pi);
        System.out.println("Pi: " + piWrapper);
        System.out.println("Pi in scientific notation: " + Double.toString(piWrapper));
        System.out.println("Pi in a byte: " + piWrapper.byteValue());

        // using Character wrapper class
        char grade = 'A';
        Character gradeWrapper = Character.valueOf(grade);
        System.out.println("Grade: " + gradeWrapper);
        System.out.println("Grade as a digit: " + Character.getNumericValue(gradeWrapper));

        // using Boolean wrapper class
        boolean isRaining = false;
        Boolean isRainingWrapper = Boolean.valueOf(isRaining);
        System.out.println("Is it Raining? " + isRainingWrapper);
        System.out.println("Is it Raining in string format? " + Boolean.toString(isRainingWrapper));

        // using Byte wrapper class
        byte byteValue = 10;
        Byte byteWrapper = Byte.valueOf(byteValue);
        System.out.println("Byte Value: " + byteWrapper);
        System.out.println("Byte Value in int format: " + byteWrapper.intValue());

        // using Short wrapper class
        short shortValue = 20;
        Short shortWrapper = Short.valueOf(shortValue);
        System.out.println("Short Value: " + shortWrapper);
        System.out.println("Short Value in long format: " + shortWrapper.longValue());

        // using Long wrapper class
        long longValue = 1000000000;
        Long longWrapper = Long.valueOf(longValue);
        System.out.println("Long Value: " + longWrapper);
        System.out.println("Long Value in float format: " + longWrapper.floatValue());

        // using Float wrapper class
        float floatValue = 78.5f;
        Float floatWrapper = Float.valueOf(floatValue);
        System.out.println("Float Value: " + floatWrapper);
        System.out.println("Float Value in double format: " + floatWrapper.doubleValue());
    }
}
