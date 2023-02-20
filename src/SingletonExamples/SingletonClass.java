package SingletonExamples;

public class SingletonClass {
    private static SingletonClass sc ;
    private String Name;
    private SingletonClass(){

    }
    public static SingletonClass getInstance(){
        if(sc== null){
            sc = new SingletonClass();
            System.out.println("new object has been created");

        }else{
            System.out.println("Object already present reusing same object");
        }
        return sc;

    }
    public void metdod1(){
        System.out.println("hello from method one");
    }
}