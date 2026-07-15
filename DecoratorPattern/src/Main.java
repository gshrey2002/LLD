//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BasePizza pizza2=new MushroomTopping(new ExtraCheese(new FarmHousePizza()));
        System.out.println("Cost of FarmHousePizza: "+pizza2.cost());
    }
}