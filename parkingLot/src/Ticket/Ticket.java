package Ticket;

import Parking.ParkingSlotInterface;
import Vehicles.Vehicle;

import java.time.LocalDateTime;

public class Ticket {
    private String id;
    private Vehicle vehicle;

    private LocalDateTime timestamp;

    private ParkingSlotInterface slot;

    public String getId() {
        return id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public ParkingSlotInterface getSlot() {
        return slot;
    }

    public Ticket(String id, Vehicle vehicle, ParkingSlotInterface slot) {
        this.id = id;
        this.vehicle = vehicle;
        this.timestamp = LocalDateTime.now();
        this.slot = slot;
    }
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

}
