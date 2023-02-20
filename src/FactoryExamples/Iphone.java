package FactoryExamples;

public class Iphone extends Phone {
    private String name;
    private String color;
    private double price;

    public Iphone(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}