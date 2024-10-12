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
        if(productList.contains(product)){
            productList.remove(product);
            int currentStock = product.getStock();
            product.setStock(currentStock + 1);
            System.out.println("Product " + product.name + " Has been removed from the cart.");
        }
        else{
            System.out.println("Product " + product.name + " was not found in the cart.");
        }
    }

    @Override
    public double calculateTotal() {
        int size = productList.size();
        double Price = 0;
        for (int i = 0 ; i < size ; i++){
           Price += productList.get(i).getPrice();
        }
        return Price;
    }
}
