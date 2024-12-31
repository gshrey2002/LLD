package Parking;

public class CarParkingSlot implements ParkingSlotInterface{

    private String id;
    private boolean isOccupied;

    public CarParkingSlot(String id) {
        this.id = id;
        this.isOccupied = false;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public boolean isOccupied() {
        return isOccupied;
    }

    @Override
    public void allocate() {
        if(!isOccupied){
            isOccupied=true;
        }else{
            System.out.println("parking is occupied");
        }
    }

    @Override
    public void free() {
        if(isOccupied){
            isOccupied=false;
        }else {
            System.out.println("Slot is already free.");
        }
    }

    @Override
    public VehicleType getSlotType() {
        return VehicleType.CAR;
    }
}
