package FactoryExamples;

public class PhoneFactory {

    public static Phone getPhone(String type, String name, String color, double price){
        if("samsung".equalsIgnoreCase(type)){
            return new Samsung(name, color, price);

        } else if ("iphone".equalsIgnoreCase(type)) {
            return new Iphone(name, color, price);
        }else{
            return null;
        }

    }

}