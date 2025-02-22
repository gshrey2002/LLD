package Factory;

public class bike implements VehicleInterface{
    @Override
    public void drive() {
        System.out.println("Driving a Bike");
    }
}
