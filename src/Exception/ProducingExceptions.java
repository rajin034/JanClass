package Exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ProducingExceptions {
    //null pointer exception
    public void doSomething(){
        Integer num = null;
        try {if(num>0) {
            System.out.println("positive number");
            }
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    // Array index out of bound exception
    public String names() {
        String[] arr = {"java", "pyhotn"};
        String s = null;
        try {
            s = arr[2];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        return s;
    }
    // Illegal state Exception
    public void processNames(){
        ArrayList<String> names = new ArrayList<String>();
        names.add("java");
        names.add("python");
        Iterator iterator = names.iterator();

            try {
                while (iterator.hasNext()) {
                    iterator.remove();
                }
            } catch (IllegalStateException es){
                System.out.println(es.getMessage());
            }

    }
    //arithmatic Exception
    public int processNum(){
        try {
            return 10 / 0;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("hello from finally");
        }

        return 0;
    }

    public static void main(String[] args) {
        ProducingExceptions pe = new ProducingExceptions();
        pe.processNames();
        pe.names();
        pe.doSomething();
        pe.processNames();
    }

}