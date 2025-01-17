import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter payment mode (card/upi):");
        String mode = scanner.nextLine();

        System.out.println("Enter identifier (card number or UPI ID):");
        String identifier = scanner.nextLine();

        int cvv=0;
        if(mode.equalsIgnoreCase("card")){
            System.out.println("enter cvv");
            cvv=scanner.nextInt();

        }


        PaymentInterface PI=PaymentFactory.factory(mode,identifier,cvv);
        PI.processPayment(45);
    }
}