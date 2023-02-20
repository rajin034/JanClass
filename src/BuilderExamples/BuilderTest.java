package BuilderExamples;

public class BuilderTest {
    public static void main(String[] args) {
        Car toyotaRav4 =new Car.CarBuilder("toyota", "black").setManual(false).setAWD(true).build();
        System.out.println(toyotaRav4);
        Car subaruOutback =new Car.CarBuilder("subaru", "black").setManual(true).setAWD(true).build();
        System.out.println(subaruOutback);

    }
}