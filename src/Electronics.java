public class Electronics extends Product{
    String brand;
    Electronics(String Name, String Brand, double Price, int Stock)
    {
        super(Name, Price, Stock);
        brand = Brand;
    }


    @Override
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Brand: "+ brand);
        System.out.println("Stock: " + stock);
    }
}