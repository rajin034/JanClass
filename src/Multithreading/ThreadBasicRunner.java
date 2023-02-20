package Multithreading;

public class ThreadBasicRunner {
    public static void main(String[] args) {
        for (int i = 1; i<5; i++){
            System.out.print(i + " ");
        }
        System.out.println("\n");
        for (int i = 5; i<10; i++){
            System.out.print(i + " ");
        }
        System.out.println("\n");
        for (int i = 10; i<15; i++){
            System.out.print(i + " ");
        }
    }
}
