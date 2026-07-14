import Strategy.DriveStrategy;
import Strategy.RaceStrategy;

public class RacingCar extends Vehicle{
    RacingCar() {
        super(new RaceStrategy());
    }
}
