package Parking;

public interface ParkingSlotInterface {
String getId();
boolean isOccupied();

void allocate();

void free();

VehicleType getSlotType();

}
