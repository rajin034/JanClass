package GenericsClass;

public class Container {

    private Class1 obj1;
    private Class2 obj3;
    private Class3 obj4;

    public Container(Class1 obj1, Class2 obj3, Class3 obj4) {
        this.obj1 = obj1;
        this.obj3 = obj3;
        this.obj4 = obj4;
    }

    public Class1 getObj1() {
        return obj1;
    }

    public void setObj1(Class1 obj1) {
        this.obj1 = obj1;
    }

    public Class3 getObj4() {
        return obj4;
    }

    public void setObj4(Class3 obj4) {
        this.obj4 = obj4;
    }

    public Class2 getObj3() {
        return obj3;
    }

    public void setObj3(Class2 obj3) {
        this.obj3 = obj3;
    }

    @Override
    public String toString() {
        return "cage{" +
                "obj1=" + obj1.toString() +
                ", obj3=" + obj3.toString() +
                ", obj4=" + obj4.toString() +
                '}';
    }
}
