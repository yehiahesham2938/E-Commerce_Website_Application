import java.util.List;

public class ProductSearchImplementation implements ProductSearcher {

    @Override
    public Product searchByName(List<Product> productList, String name) {
        int sizeOfList = productList.size();
        boolean found = false;
        for (int i = 0 ; i < sizeOfList; i++){
            String CurrentName = productList.get(i).getName();
            if(CurrentName == name){
                System.out.println("The " + CurrentName + " Is Found and its details are displayed");
                productList.get(i).displayInfo();
                found = true;
            }
        }
        if(!found){
            System.out.println("NoSuchElementException" + "Product "+ name + " Not found");
        }
        return null;
    }
}
