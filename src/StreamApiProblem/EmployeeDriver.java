package StreamApiProblem;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeDriver {
    public static void main(String[] args) {
        // create 15 different employee objects
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John Doe", "Male", 35, "IT", 2010, 60000.0));
        employees.add(new Employee(2, "Jane Smith", "Female", 28, "Sales", 2012, 50000.0));
        employees.add(new Employee(3, "Bob Johnson", "Male", 42, "Marketing", 2009, 80000.0));
        employees.add(new Employee(4, "Alice Jones", "Female", 31, "HR", 2011, 55000.0));
        employees.add(new Employee(5, "Tom Williams", "Male", 29, "Finance", 2013, 70000.0));
        employees.add(new Employee(6, "Mary Brown", "Female", 36, "IT", 2010, 65000.0));
        employees.add(new Employee(7, "David Lee", "Male", 38, "Sales", 2011, 75000.0));
        employees.add(new Employee(8, "Emily Davis", "Female", 27, "Marketing", 2014, 50000.0));
        employees.add(new Employee(9, "Peter Garcia", "Male", 33, "HR", 2012, 65000.0));
        employees.add(new Employee(10, "Anna Lee", "Female", 30, "Finance", 2015, 85000.0));
        employees.add(new Employee(11, "Alex Brown", "Male", 25, "IT", 2018, 40000.0));
        employees.add(new Employee(12, "Amy Davis", "Female", 32, "Sales", 2013, 55000.0));
        employees.add(new Employee(13, "Carl Johnson", "Male", 38, "Marketing", 2011, 70000.0));
        employees.add(new Employee(14, "Eva Smith", "Female", 29, "HR", 2016, 45000.0));
        employees.add(new Employee(15, "Frank Lee", "Male", 27, "Finance", 2014, 60000.0));


        //Count how many male and female employees are there in the organization?
        System.out.println("Counting how many male and female employees are there in the organization: ");
        Map<String, Long> countmap = employees.stream().collect(Collectors.groupingBy(Employee :: getGender, Collectors.counting()));
        System.out.println(countmap);
        System.out.println("\n");
        //Print the name of all departments in the organization
        System.out.println("printing all the department of organization: ");
        employees.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
        System.out.println("\n");
        // printing average age of male and female employee
        System.out.println("calculating average age of male and female employee: ");
        Map<String, Double> averageAgeOfMaleAndFemale = employees.stream().
                collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
        System.out.println(averageAgeOfMaleAndFemale);
        System.out.println("\n");
        // Get the details of highest paid employee in the organization
        System.out.println("findiing highest paid employee ");
        Optional<Employee> hpe  = employees.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.println(hpe.get().getName());
        System.out.println("\n");
        // Get the names of all employees who have joined after 2015
        System.out.println("filtering the employees that joined after 2015");
        employees.stream().filter(e->e.getYearOfJoining()>2015).map(Employee::getName)
                .forEach(System.out::println);
        System.out.println("\n");
        //Count the number of employees in each department
        System.out.println("Counting the number of employees in each department: ");
        Map<String, Long> numD = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        Set<Map.Entry<String ,Long>> eS= numD.entrySet();
        for(Map.Entry<String, Long> entry : eS){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("\n");
        //average salary of each department
        System.out.println("printing average salary of each department");
        Map<String, Double> avem = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        Set<Map.Entry<String, Double>> ases = avem.entrySet();

        for(Map.Entry<String, Double> entry : ases){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("\n");
        // Finding the youngest male employee in It department
        System.out.println("finding youngest employee in It department ");
        Optional<Employee> empOpt = employees.stream().filter(e->e.getGender()=="Male" && e.getDepartment() == "IT").min(Comparator.comparingInt(Employee::getAge));
        System.out.println("youngest male employee in It department is " + empOpt.get().getName() + " with age " + empOpt.get().getAge());
        System.out.println("\n");


    }
}
