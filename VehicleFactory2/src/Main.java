import Factory.BikeFactory;
import Factory.VehicleFactoryInterface;
import Factory.VehicleInterface;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        VehicleFactoryInterface bikefactory=new BikeFactory();
        VehicleInterface bike=bikefactory.createVehicle();
//
        bike.drive();

    }
}