package primitiveDataType;

public class PrimitiveVsNonPrimitive {
    String Name;

    public PrimitiveVsNonPrimitive(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "PrimitiveVsNonPrimitive{" +
                "Name='" + Name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        int x=10;
        PrimitiveVsNonPrimitive obj = new PrimitiveVsNonPrimitive("john");
        System.out.println(x);
        System.out.println(obj);


    }
}
