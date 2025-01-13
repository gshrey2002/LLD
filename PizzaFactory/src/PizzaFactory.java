public class PizzaFactory{
    public static Pizza getPizza(String type ){
        if(type.equalsIgnoreCase("Margherita")){
            return new MargheritaPizza();
        } else if (type.equalsIgnoreCase("Pepperoni")) {
            return new PepronniPizza();

        }else{
            throw new IllegalArgumentException("Invalid pizza type: " + type);
        }

    }
}
