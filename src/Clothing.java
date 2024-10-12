public class Clothing extends Product{
    String size;
    Clothing(String Name,double Price, int Stock, String Size){
        super(Name, Price, Stock);
        size = Size;
    }

    @Override
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("size: "+ size);
        System.out.println("Stock: " + stock);
    }
}
