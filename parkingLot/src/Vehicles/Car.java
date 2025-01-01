package Vehicles;

import Parking.VehicleType;

public class Car implements Vehicle{
    private String regnNumber;

    public Car(String regnNumber) {
        this.regnNumber = regnNumber;
    }

    private final VehicleType vehicleType=VehicleType.CAR;
    @Override
    public String getRegistrationNumber() {
        return regnNumber;
    }

    @Override
    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
