package InterfaceExamples;

import static InterfaceExamples.Shape.interfaceStaticMethod;

public class ShapeDriver {
    public static void main(String[] args) {
        Shape circle = new Circle(4.0);
        Circle circle1 = new Circle(3.0);
        Shape rectangle = new Rectangle(2.0, 3.0);
        Rectangle rectangle1 = new Rectangle(3.0, 4.0);
        System.out.println(circle.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle1.getPerimeter());
        circle.interfaceMethod();
        interfaceStaticMethod();
    }

}
