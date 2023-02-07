package Comparator;

import java.util.Comparator;

class Student {
    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }
}

class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "John");
        Student student2 = new Student(2, "ane");

        NameComparator comparator = new NameComparator();
        System.out.println(comparator.compare(student1, student2)); // Output: -1
        System.out.println(comparator.compare(student2, student1)); // Output: 1
        System.out.println(comparator.compare(student1, student1)); // Output: 0


    }
}
