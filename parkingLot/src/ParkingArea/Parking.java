package ParkingArea;
import Parking.ParkingSlotInterface;
import Vehicles.Vehicle;
import Parking.BikeParkingSlot;
import Parking.CarParkingSlot;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Parking {
    private String name;
    private String address;

    private List<ParkingSlotInterface> slots;

    public Parking(String name, String address) {
        this.name = name;
        this.address = address;
        this.slots = new ArrayList<>();
    }
    public void initializeSlots(int bikeSlots, int carSlots) {
        for (int i = 1; i <= bikeSlots; i++) {
            slots.add(new BikeParkingSlot("BikeSlot-" + i));
        }
        for (int i = 1; i <= carSlots; i++) {
            slots.add(new CarParkingSlot("CarSlot-" + i));
        }
    }

    public void addSlot(ParkingSlotInterface slot){
        slots.add(slot);

    }

    public void allocateSlot(Vehicle vehicle){
        for(ParkingSlotInterface slot : slots){
            if (!slot.isOccupied() && slot.getSlotType().equals(vehicle.getVehicleType())) {
                slot.allocate();
                System.out.println(vehicle.getRegistrationNumber() + " allocated to slot " + slot.getId());
                return;
            }
        }
        System.out.println("No available slot for " + vehicle.getVehicleType() + " with registration number: " + vehicle.getRegistrationNumber());
    }
    public void freeSlot(ParkingSlotInterface slot) {
        slot.free();
        System.out.println("Slot " + slot.getId() + " is now free.");
    }

    public List<ParkingSlotInterface> getAvailableSlots() {
//        int availableSlots = 0;
//        for (ParkingSlotInterface slot : slots) {
//            if (!slot.isOccupied()) {
//                availableSlots++;
//            }
//        }
//        return availableSlots;
        return slots.stream()
                .filter(slot -> !slot.isOccupied()) // Only include unoccupied slots
                .collect(Collectors.toList());
    }
}
