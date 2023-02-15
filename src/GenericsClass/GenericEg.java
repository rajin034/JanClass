package GenericsClass;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class GenericEg {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        Class1 cc = new Class1();

        a.add("rajin");
        a.add(100);
        a.add(200.2);
        a.add(cc);

        System.out.println(a.toString());

        String str = (String) a.get(0);
        int a1 = (int) a.get(1);

        Class1 cc1 = (Class1) a.get(3);

        ArrayList<String> strL = new ArrayList<>();
        strL.add("rajin");
        strL.add("aasutosh");
        strL.add("jobi");

    }
}

