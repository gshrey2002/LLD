package Strategy;

public class RaceStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving the car... vrooooom");
    }
}
