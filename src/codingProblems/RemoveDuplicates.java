package codingProblems;

public class RemoveDuplicates {
  public static String removeDuplicates(String input) {
    StringBuilder output = new StringBuilder();

    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      if (output.indexOf(String.valueOf(c)) == -1) {
        output.append(c);
      }
    }

    return output.toString();
  }

  public static void main(String[] args) {

    String str = "";
    System.out.println(str.hashCode());
    str = "rajin";
    System.out.println(str.hashCode());

    StringBuilder sb = new StringBuilder();
    System.out.println(sb.hashCode());
    sb.append("rajin");
    System.out.println(sb.hashCode());

    String input = "aabbccdeeeffffff";
    System.out.println("Input String: " + input);
    System.out.println("Output String: " + removeDuplicates(input));
  }
}
