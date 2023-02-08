package GenericsClass;

public class GenericContainer <T,E,K>{
    private T obj1;
    private E obj2;
    private K obj3;

    public GenericContainer(T obj1, E obj2, K obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public T getObj1() {
        return obj1;
    }

    public void setObj1(T obj1) {
        this.obj1 = obj1;
    }

    public E getObj2() {
        return obj2;
    }

    public void setObj2(E obj2) {
        this.obj2 = obj2;
    }

    public K getObj3() {
        return obj3;
    }

    public void setObj3(K obj3) {
        this.obj3 = obj3;
    }

    @Override
    public String toString() {
        return "GenericCage{" +
                "obj1=" + obj1.toString() +
                ", obj2=" + obj2.toString()+
                ", obj3=" + obj3.toString() +
                '}';
    }
}
