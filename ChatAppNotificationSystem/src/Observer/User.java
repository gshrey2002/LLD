package Observer;

public class User implements Observer{

    private String UserName;

    public User(String userName) {
        this.UserName = userName;
    }


    @Override
    public void update(String Message, String Category) {
        System.out.println("hi "+UserName+" new message in "+Category+" message is "+Message);
    }
}
