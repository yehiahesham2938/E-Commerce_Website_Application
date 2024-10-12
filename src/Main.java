import java.util.List;

public class Main {
    public static void main(String[] args) {
        Electronics device1;
        Electronics device2;
        Electronics device3;

        Clothing clothing;
        device1 = new Electronics("Laptop", "Dell", 10000, 4);
        device2 = new Electronics("Laptop", "HP", 3000, 3);
        device3 = new Electronics("Mobile", "Iphone", 9090, 1);

        clothing = new Clothing("Zara", 100, 22, "Small");

        device1.displayInfo();
        System.out.println("___________");
       clothing.displayInfo();
        System.out.println("___________");
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(device1);
        shoppingCart.removeProduct(device2);
        shoppingCart.addProduct(device3);
        shoppingCart.removeProduct(device1);
        System.out.println("The Total Price of Products equals "+shoppingCart.calculateTotal());
        System.out.println("___________");
        ProductSearchImplementation productSearch;
        productSearch = new ProductSearchImplementation();
        productSearch.searchByName(shoppingCart.returnList(), "Mobile");

    }
}