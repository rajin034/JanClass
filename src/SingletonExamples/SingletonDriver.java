package SingletonExamples;

public class SingletonDriver {
    public static void main(String[] args) {
        SingletonClass sc1;
        sc1 =SingletonClass.getInstance();
        sc1.metdod1();
        SingletonClass sc2 = SingletonClass.getInstance();
        sc2.metdod1();
        System.out.println(sc1.equals(sc2));
        System.out.println(sc1.hashCode());
        System.out.println(sc2.hashCode());

    }
}