package Comparator;

import java.util.ArrayList;
import java.util.Collections;
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

    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", name='" + name + '\'' + '}';
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }
}

class RollNoComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getRollNo() > o2.getRollNo()) {
            return 1;
        } else {
            return -1;
        }
    }
}

class Main {
    public static void main(String[] args) {

        Student student1 = new Student(10, "john");
        Student student2 = new Student(2, "ane");
        Student student3 = new Student(20, "jane");
        ArrayList<Student> aList = new ArrayList<Student>();
        aList.add(student1);
        aList.add(student2);
        aList.add(student3);
        System.out.println(aList);
        NameComparator comparator = new NameComparator();
        RollNoComparator rc = new RollNoComparator();
        Collections.sort(aList, comparator);
        System.out.println(aList);

        Collections.sort(aList, rc);
        System.out.println(aList);


    }
}
