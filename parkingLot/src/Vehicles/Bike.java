package Vehicles;

import Parking.VehicleType;

public class Bike implements Vehicle{
    private String regnNumber;
    private final VehicleType vehicleType=VehicleType.BIKE;
    @Override
    public String getRegistrationNumber() {
        return regnNumber;
    }

    public Bike(String regnNumber) {
        this.regnNumber = regnNumber;
    }

    @Override
    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
