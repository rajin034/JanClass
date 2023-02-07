package Comparable;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(9);
        nums.add(10);
        nums.add(19);
        nums.add(100);
        nums.add(12);
        Collections.sort(nums);
        System.out.println(nums);

        List<String> str = new ArrayList<>();
        str.add("rajin");
        str.add("jobi");
        str.add("yuwa");
        str.add("aasutosh");

        Collections.sort(str);
        System.out.println(str);

        Laptop l1 = new Laptop("apple", 8,1000.0);
        Laptop l2 = new Laptop("apple", 12,1200.0);
        Laptop l3 = new Laptop("apple", 16,1500.0);
        Laptop l4 = new Laptop("apple", 4,700.0);

        List<Laptop> laptop = new ArrayList<>();
        laptop.add(new Laptop("apple", 8,1000.0));
        laptop.add(new Laptop("apple", 12,1200.0));
        laptop.add(new Laptop("apple", 16,1500.0));
        laptop.add(new Laptop("apple", 4,700.0));

        Collections.sort(laptop);
        System.out.println(laptop);




    }
}
