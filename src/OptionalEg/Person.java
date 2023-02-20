package OptionalEg;

import java.util.Optional;

public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<Integer> getAge() {
        return Optional.ofNullable(age);
    }
}

class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person(null, null);

        String name1 = person1.getName().orElse("Unknown");
        String name2 = person2.getName().orElse("Unknown");

        Integer age1 = person1.getAge().orElse(0);
        Integer age2 = person2.getAge().orElse(0);

        System.out.println(name1 + " is " + age1 + " years old.");
        System.out.println(name2 + " is " + age2 + " years old.");
    }
}