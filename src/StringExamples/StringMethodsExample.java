package StringExamples;

public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "Hello World!";

        // length() method
        System.out.println("Length of the string: " + str.length());

        // charAt() method
        System.out.println("The character at index 5: " + str.charAt(5));

        // indexOf() method
        System.out.println("The index of character 'o': " + str.indexOf('o'));

        // substring() method
        System.out.println("Substring from index 6: " + str.substring(6));
        System.out.println("Substring from index 0 to 5: " + str.substring(0, 5));

        // trim() method
        String str2 = "   Hello  ";
        System.out.println("Original string: '" + str2 + "'");
        System.out.println("Trimmed string: '" + str2.trim() + "'");

        // replace() method
        System.out.println("Original string: '" + str + "'");
        System.out.println("String after replacing 'o' with 'X': " + str.replace('o', 'X'));

        // toLowerCase() and toUpperCase() methods
        System.out.println("Original string: '" + str + "'");
        System.out.println("Lowercase string: '" + str.toLowerCase() + "'");
        System.out.println("Uppercase string: '" + str.toUpperCase() + "'");
    }
}
