abstract public class Product {
    String name;
    double price;
    int stock;

    Product(String Name, double Price, int Stock){
        name = Name;
        price = Price;
        stock = Stock;
    }
    public void setStock(int Stock){
        stock = Stock;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getStock(){
        return stock;
    }
    abstract void displayInfo();
}
