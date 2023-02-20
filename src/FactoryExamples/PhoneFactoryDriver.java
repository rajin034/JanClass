package FactoryExamples;

public class PhoneFactoryDriver {
    public static void main(String[] args) {
        Phone s = PhoneFactory.getPhone("samsung", "galaxy S22", "black", 1100.00);
        Phone i = PhoneFactory.getPhone("iphone", "13 pro", "black", 1200.00);

        System.out.println(s);
        System.out.println(i);

    }
}