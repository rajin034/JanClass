package FunctionalInterfacesAndLambdas;

@FunctionalInterface
public interface Calculator {
    public int calculate(int a, int b);
}
class Add implements Calculator{
    @Override
    public int calculate(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Calculator adder = new Add();
        Calculator subtract = (a,b) -> a-b;
        Calculator divider = (a,b) -> a/b;
        System.out.println(adder.calculate(1,2));
        System.out.println(subtract.calculate(1,2));
        System.out.println(divider.calculate(1,2));
    }
}
