import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements ShoppingCartOperations {
    private List<Product> productList;
    ShoppingCart(){
        productList = new ArrayList<>();
    }

    @Override
    public void addProduct(Product product) {
        if(product.getStock() >= 1){
            productList.add(product);
           int currentStock = product.getStock();
            product.setStock(currentStock - 1   );
            System.out.println("Product "+ product.getName() + " Has been Added to the cart");
        }
        else if(product.getStock() < 1){
            System.out.println("Product " + product.getName() + "Is out of Stock.");
        }
    }

    @Override
    public void removeProduct(Product product) {

    }

    @Override
    public double calculateTotal() {
        return 0;
    }
}
