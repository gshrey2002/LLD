package Factory;

public class BikeFactory implements VehicleFactoryInterface{
    @Override
    public VehicleInterface createVehicle() {
        return new bike();
    }
}
