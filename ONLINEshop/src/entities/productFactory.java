package entities;

public class productFactory {
    public product createProduct(String category){
        switch (category.toLowerCase()){
            case "electronic":
                return  new electronicProdcut();
            case "clothing":
                return  new clothingProduct();

            default:
                throw new IllegalArgumentException("Invalid category Asked"+ category);
        }
    }
}
