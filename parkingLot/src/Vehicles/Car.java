package Vehicles;

public class Car implements Vehicle{
    private String regnNumber;

    public Car(String regnNumber) {
        this.regnNumber = regnNumber;
    }

    private final String vehicleType="Car";
    @Override
    public String getRegistrationNumber() {
        return regnNumber;
    }

    @Override
    public String getVehicleType() {
        return vehicleType;
    }
}
