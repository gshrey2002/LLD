public class UsersCart implements Cart{
    @Override
    public String items() {
        return "Users 1 Carts";
    }

    @Override
    public Double totalCost() {
        return 5100.0;
    }
}
