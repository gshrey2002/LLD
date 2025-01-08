package Observer;

public class Customer implements Observer{

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String ProductName,String Category) {
        System.out.println("Hello " + name + "New product in "+ Category + "Named "+ProductName+ " has been added");

    }
}
