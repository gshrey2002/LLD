import Observer.User;
import Subject.ChatApp;

public class Main {
    public static void main(String[] args)
    {
        ChatApp group1=new ChatApp("tirol Squad");
        ChatApp group2=new ChatApp("Mitras");

        User Shrey=new User("Shrey");
        User Viplove=new User("Viplove");

        group1.addObserver(Viplove);
        group2.addObserver(Shrey);
        group2.addObserver(Viplove);


        group1.addMessage("message in tirol squad");

        group2.addMessage("message in Mirtas");

        group2.removeObserver(Shrey);
        group2.addMessage("removed shrey");

        System.out.println("Hello world!");
    }
}