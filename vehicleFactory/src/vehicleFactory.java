public class vehicleFactory {

    public static vehicleInterface factory(String type){
        if(type.equalsIgnoreCase("bike")){
            return new bike();
        } else if (type.equalsIgnoreCase("car")) {
            return new car();
        }else{
            return new truck();
        }
    }
}
