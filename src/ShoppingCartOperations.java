public interface ShoppingCartOperations {
    public void addProduct(Product product);
    public void removeProduct(Product product);
    public double calculateTotal();
}