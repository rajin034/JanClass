package StringExamples;

public class InitilizingString {
    public static void main(String[] args) {
        String s = "Java!!";
        String s0 = "Java!!";
        System.out.println( s == s0);
        String s1 = "python";
        String s2 =new String("java");
        s1=s;
        /*System.out.println(s.concat( " is fun!!"));
        System.out.println(s);

        /*s="Python";*/
        /*System.out.println(s);*/
        /*s0 = "pyhton";*/
        /*System.out.println(s==s1);*/
        System.out.println(s.hashCode());
        System.out.println(s0.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.hashCode());
/*        s0 =s1;
        System.out.println(s0.hashCode());
        System.out.println(s2.hashCode());*/
        /*System.out.println(s1.hashCode());*/

    }

}