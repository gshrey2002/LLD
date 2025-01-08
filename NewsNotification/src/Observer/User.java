package Observer;

public class User implements Observer{

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String news, String category) {
        System.out.println("Hello "+name+ " topic "+ category +" has posted an update: "+news);
    }
}
