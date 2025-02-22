package Factory;

public class car implements VehicleInterface{
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}
