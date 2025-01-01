package Gate;

import ParkingArea.Parking;
import Ticket.Ticket;
import Vehicles.Vehicle;
import Parking.ParkingSlotInterface;

import java.util.Optional;
import java.util.stream.*;



public class EntryGate implements Gate{
    private String id;

    public EntryGate(String id) {
        this.id = id;
    }

    public Ticket issueTicket(Vehicle vehicle, Parking parking) {
        // Find an available slot matching the vehicle type
        Optional<ParkingSlotInterface> availableSlot = parking.getAvailableSlots().stream()
                .filter(slot -> slot.getSlotType() == vehicle.getVehicleType())
                .findFirst(); // Get the first matching slot

        if (availableSlot.isPresent()) {
            // Allocate the slot
            ParkingSlotInterface slot = availableSlot.get();
            slot.allocate();

            // Create and return a new Ticket
            return new Ticket(
                    "TICKET-" + System.currentTimeMillis(), // Unique ID
                    vehicle,                                 // Vehicle details
                    slot                                     // Allocated parking slot
            );
        } else {
            throw new RuntimeException("No available slots for vehicle type: " + vehicle.getVehicleType());
        }
    }

    @Override
    public String Id() {
        return id;
    }

    @Override
    public String GateType() {
        return null;
    }
}
