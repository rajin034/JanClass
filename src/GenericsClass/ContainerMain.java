package GenericsClass;

import java.util.ArrayList;

public class ContainerMain {
    public static void main(String[] args) {
        Container c1 = new Container(new Class1(), new Class2(), new Class3());
        GenericContainer<Class1, Class2, Class4> c2 = new GenericContainer<>(new Class1(),new Class2(), new Class4());
        System.out.println(c1);
        System.out.println(c2);
       /* ArrayList al = new ArrayList();
        al.add("rajin");
        al.add(100);

        String str = (String) al.get(0);

        ArrayList<String> al1 = new ArrayList<>();
        al1.add("rajin");
        al1.add("100");
        String str1 = al1.get(0);*/

    }
}
