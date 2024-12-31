//package Parking;
//
//public class ParkingSlot {
//    private String id;
//    private VehicleType type;
//    private Boolean isOccupied;
//
//    public ParkingSlot(String id, VehicleType type) {
//        this.id = id;
//        this.type = type;
//        this.isOccupied = false;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public VehicleType getType() {
//        return type;
//    }
//
//    public boolean getOccupied() {
//        return isOccupied;
//    }
//
//
//    public void allocate(){
//        if(!isOccupied){
//            isOccupied=true;
//        }else{
//            System.out.println("parking is occupied");
//        }
//    }
//
//    public void free(){
//        if(isOccupied){
//            isOccupied=false;
//        }else {
//            System.out.println("Slot is already free.");
//        }
//    }
//}
