import DAL.userDatabase;
import entities.order;
import entities.product;
import entities.productFactory;
import entities.userAccount;

import java.util.ArrayList;
import java.util.List;

public class ShopWorld {

    public static void main(String args[]){
        userDatabase userDatabase= DAL.userDatabase.getInstance();
//        userDatabase userDatabase1= DAL.userDatabase.getInstance();
//        System.out.println(userDatabase);
//        System.out.println(userDatabase1);
        productFactory productFactory= new productFactory();
        product electronicProd=productFactory.createProduct("electronic");
        electronicProd.displayInfo();

        product clothingProd=productFactory.createProduct("clothing");
        clothingProd.displayInfo();

        //build user acc
        userAccount.userAccountBuilder userBuilder=new userAccount.userAccountBuilder("shrey","pwd");
        userAccount userAccount=userBuilder.build();

        System.out.println(userAccount);

        List<product> prod=new ArrayList<>();
        prod.add(electronicProd);
        prod.add(clothingProd);

        order.orderBuilder orderBuilder=new order.orderBuilder("id",prod);
        System.out.println(orderBuilder);

    }
}
