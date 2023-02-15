package CollectionFramework.QueueProblems;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;

class User implements Comparable<User> {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(User o) {
        return (this.getName().compareTo(o.getName()) );
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        PriorityQueue<User> queue = new PriorityQueue<>();
        PriorityQueue<Student> squeue = new PriorityQueue<>(new NameComparator());
        PriorityQueue<Integer> il = new PriorityQueue<>(new numComparator());
        il.add(98);
        il.add(99);
        il.add(10);
        il.add(120);
        il.add(89);
        il.add(180);

        squeue.add(new Student("rajin"));
        squeue.add(new Student("jobi"));
        squeue.add(new Student("john"));
        squeue.add(new Student("yuwa"));
//        System.out.println(squeue);

        while(!squeue.isEmpty()){
            System.out.println (squeue.poll() + "\n");
        }



        // Adding users to the queue
        queue.add(new User(19, "amy"));
        queue.add(new User(20, "tim"));
        queue.add(new User(3, "jane"));


        // Writing users to a file
        try (FileWriter writer = new FileWriter("users.txt")) {
            while (!queue.isEmpty()) {
                User user = queue.poll();
                System.out.println(user);
                writer.write(user.toString() + "\n");

            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        try (FileWriter writer = new FileWriter("numbers.txt")) {
            while (!il.isEmpty()) {
                Integer number = il.poll();
                System.out.println(number);
                writer.write(number + "\n");

            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
class numComparator implements Comparator<Integer> {

    @Override
    public int compare ( Integer a, Integer b ){
        if (a< b){
            return -1;

        }else{
            return 1;
        }
    }



}
class NameComparator implements Comparator<Student>{
    @Override
    public int compare (Student s1, Student s2){
        return s1.name.compareTo(s2.name);
    }
}
