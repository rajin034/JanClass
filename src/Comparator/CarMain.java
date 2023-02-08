package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CarMain {
    static Comparator<Car> com = new Comparator<Car>(){
        public int compare(Car car1, Car car2){
            return car1.getBrand().compareTo(car2.getBrand());


        }
    };
    static Comparator<Car> com1 = new Comparator<Car>(){
        public int compare(Car car1, Car car2){
            return car1.getColor().compareTo(car2.getColor());


        }
    };

    static Comparator<Car> com2 = new Comparator<Car>(){
        public int compare(Car car1, Car car2){
            if(car1.getPrice() > car2.getPrice()){
                return 1;
            }else if ((car1.getPrice() < car2.getPrice())) {
                return -1;
            }else{
                return 0;
            }


        }
    };


    public static void main(String[] args) {
        Car c1 = new Car("toyota", "blue" ,40000.00);
        Car c2 = new Car("subaru", "red" ,38000.00);
        Car c3 = new Car("mercedes", "silver" ,80000.00);
        Car c4 = new Car("porsche", "yellow" ,95000.00);
        Car c5 = new Car("audi", "white" ,100000.00);
        ArrayList<Car> carList = new ArrayList<Car>();

        carList.add(c1);
        carList.add(c2);
        carList.add(c3);
        carList.add(c4);
        carList.add(c5);


        System.out.println("original List " + carList + "\n" );

        Collections.sort(carList, com);
        System.out.println("Sorted based on brand: " + carList + "\n");

        Collections.sort(carList, com1);
        System.out.println("Sorted based on color: " + carList+ "\n");

        Collections.sort(carList, com2);
        System.out.println("Sorted based on price: " + carList+ "\n");





    }
}
