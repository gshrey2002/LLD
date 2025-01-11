package Observer;

public class User implements UserInterface{
    @Override
    public void update(String notification) {
        System.out.println("new notification "+notification);
    }
}
