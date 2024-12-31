package Vehicles;

public class Bike implements Vehicle{
    private String regnNumber;
    private final String vehicleType="Bike";
    @Override
    public String getRegistrationNumber() {
        return regnNumber;
    }

    public Bike(String regnNumber) {
        this.regnNumber = regnNumber;
    }

    @Override
    public String getVehicleType() {
        return vehicleType;
    }
}
