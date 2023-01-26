package InterfaceExamples;

interface Shape {
  abstract double getArea();
  abstract double getPerimeter();
  default void interfaceMethod(){
    System.out.println("i am interface Method");
  }
  static void interfaceStaticMethod(){
    System.out.println("static method of interface");
  }
}

class Rectangle implements Shape {
  private double width;
  private double height;

  Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public double getArea() {
    return width * height;
  }

  @Override
  public double getPerimeter() {
    return 2 * (width + height);
  }
}

class Circle implements Shape {
  private double radius;

  Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }
}