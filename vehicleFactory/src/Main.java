public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
        vehicleInterface bike=vehicleFactory.factory("bike");
        bike.hasTyres();

        vehicleInterface truck=vehicleFactory.factory("truck");
        truck.hasTyres();

        vehicleInterface car=vehicleFactory.factory("car");
        car.hasTyres();
    }
}