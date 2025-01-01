package Payment;

import Ticket.Ticket;

import java.time.Duration;
import java.time.LocalDateTime;

public class Payment {
    private static final double BIKE_RATE_PER_HOUR = 10.0;
    private static final double CAR_RATE_PER_HOUR = 20.0;

    public static double calculatePayment(Ticket ticket) {
        LocalDateTime entryTime = ticket.getTimestamp();
        LocalDateTime exitTime = LocalDateTime.now();

        // Calculate duration in hours
        Duration duration = Duration.between(entryTime, exitTime);
        long hours = duration.toHours();
        if (duration.toMinutes() % 60 > 0) {
            hours += 1; // Round up to the next hour
        }

        // Determine rate based on vehicle type
        double rate;
        switch (ticket.getVehicle().getVehicleType()) {
            case BIKE:
                rate = BIKE_RATE_PER_HOUR;
                break;
            case CAR:
                rate = CAR_RATE_PER_HOUR;
                break;
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + ticket.getVehicle().getVehicleType());
        }

        return rate * hours;
    }
}
