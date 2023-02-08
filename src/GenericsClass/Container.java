package GenericsClass;

public class Container {

    private Object obj1;
    private Object obj3;
    private Object obj4;

    public Container(Object obj1, Object obj3, Object obj4) {
        this.obj1 = obj1;
        this.obj3 = obj3;
        this.obj4 = obj4;
    }

    public Object getObj1() {
        return obj1;
    }

    public void setObj1(Object obj1) {
        this.obj1 = obj1;
    }

    public Object getObj4() {
        return obj4;
    }

    public void setObj4(Object obj4) {
        this.obj4 = obj4;
    }

    public Object getObj3() {
        return obj3;
    }

    public void setObj3(Object obj3) {
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
