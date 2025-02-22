package Factory;

public class CarFactory implements VehicleFactoryInterface{
    @Override
    public VehicleInterface createVehicle() {
        return new car();
    }
}
