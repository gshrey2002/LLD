public abstract class CoffeeDecorator implements CoffeeInterface{
    protected CoffeeInterface cs;

    public CoffeeDecorator(CoffeeInterface cs) {
        this.cs = cs;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public Double getPrice() {
        return null;
    }
}
