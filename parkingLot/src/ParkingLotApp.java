import Gate.EntryGate;
import Gate.ExitGate;
import Parking.BikeParkingSlot;
import Parking.CarParkingSlot;
import Parking.ParkingSlotInterface;
import ParkingArea.Parking;
import Ticket.Ticket;
import Vehicles.Bike;
import Vehicles.Car;
import Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotApp {
    public static void main(String[] args) {
        Parking parking = new Parking("City Parking", "123 Main Street, Metropolis");

        EntryGate entryGate = new EntryGate("Entry-1");
        ExitGate exitGate = new ExitGate("Exit-1");



        parking.initializeSlots(3, 4);
        Vehicle bike1 = new Bike("B1234");
        Vehicle car1 = new Car("C5678");
        Vehicle bike2 = new Bike("B5678");
        Vehicle car2 = new Car("C1234");
        Vehicle bike3 = new Bike("B9999");

        Ticket bikeTicket = entryGate.issueTicket(bike1, parking);
        bikeTicket.setTimestamp(bikeTicket.getTimestamp().minusHours(3));

        Ticket carTicket = entryGate.issueTicket(car1, parking);


        parking.allocateSlot(bike1); // Should allocate a bike slot
        parking.allocateSlot(car1); // Should allocate a car slot
        parking.allocateSlot(bike2); // Should allocate another bike slot
        parking.allocateSlot(car2); // Should allocate another car slot
        parking.allocateSlot(bike3);
        try {
            Thread.sleep(3000); // 3 seconds delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Available slots: " + parking.getAvailableSlots().size());

        // Step 5: Free a slot if available
        if (!parking.getAvailableSlots().isEmpty()) {
            ParkingSlotInterface slotToFree = parking.getAvailableSlots().get(0); // First available slot
            parking.freeSlot(slotToFree); // Free the slot
            System.out.println("Slot freed: " + slotToFree.getId());
        } else {
            System.out.println("No slots available to free.");
        }

        // Try allocating the extra bike again
//        parking.allocateSlot(bike3); // Attempt allocation after freeing a slot

        exitGate.processExit(bikeTicket, parking);
        exitGate.processExit(carTicket, parking);

        // Step 6: Check final available slots
        System.out.println("Available slots after processing exits: " + parking.getAvailableSlots().size());

        // Step 6: Final check
        System.out.println("Available slots after reallocation: " + parking.getAvailableSlots().size());

    }
}
