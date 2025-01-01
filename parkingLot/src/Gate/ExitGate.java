package Gate;

import ParkingArea.Parking;
import Payment.Payment;
import Ticket.Ticket;
import Parking.ParkingSlotInterface;

public class ExitGate implements Gate {
    private String id;

    public ExitGate(String id) {
        this.id = id;
    }

    public void processExit(Ticket ticket, Parking parking) {
        // Calculate payment
        double amount = Payment.calculatePayment(ticket);
        System.out.println("Total payment for vehicle " + ticket.getVehicle().getRegistrationNumber() + ": $" + amount);

        // Free the parking slot
        ParkingSlotInterface slot = ticket.getSlot();
        parking.freeSlot(slot);
        System.out.println("Slot " + slot.getId() + " is now free.");
    }

    @Override
    public String Id() {
        return id;
    }

    @Override
    public String GateType() {
        return "Exit";
    }
}
