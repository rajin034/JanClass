package FactoryExamples;

public class Samsung extends Phone {

    private String name;
    private String color;
    private double price;

    public Samsung(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getPrice() {
        return price;
    }
}