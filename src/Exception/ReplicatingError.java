package Exception;

import java.util.ArrayList;
import java.util.List;

public class ReplicatingError {
    public static void recurse() {
        recurse();
        //This code defines a method that calls itself recursively
        // without any termination condition.
        // When the method is called, it will keep adding new calls to the call stack
        // until the stack is full and the JVM throws a StackOverflowError.
    }

    public static void main(String[] args) {
        /*recurse();*/
        List<String> list = new ArrayList<>();
        while (true) {
            list.add("hello");
            //This code creates an infinite loop that adds a string to an ArrayList.
            // Since the loop runs indefinitely,
            // the list will keep growing until the JVM runs out of memory and throws an OutOfMemoryError.
        }

    }
}
