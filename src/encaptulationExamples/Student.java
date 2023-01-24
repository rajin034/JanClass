package encaptulationExamples;

public class Student {
    private String name;
    private int age;
    private int[] grades;
  
    public Student(String name, int age, int[] grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }
  
    public String getName() {
        return name;
    }
  
    public int getAge() {
        return age;
    }
  
    public int getGrade(int index) {
        return grades[index];
    }
}