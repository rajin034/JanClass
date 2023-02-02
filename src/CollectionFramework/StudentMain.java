package CollectionFramework;

import java.util.ArrayList;

public class StudentMain {
  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student("John", 25));
    students.add(new Student("Jane", 22));
    students.add(new Student("Jim", 23));

    for (Student student : students) {
      System.out.println("Name: " + student.getName() + " Age: " + student.getAge());
    }
  }
}