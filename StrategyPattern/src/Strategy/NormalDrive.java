package Strategy;

public class NormalDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving the car normally...");
    }
}
