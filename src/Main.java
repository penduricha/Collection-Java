import daos.ProductDao;
import models.Product;
import models.ProductType;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductDao manager = new ProductDao();

        ProductType electronics = new ProductType(1L, "Electronics");
        ProductType groceries = new ProductType(2L, "Groceries");

        Product phone = new Product(1L, "Smartphone", 699.99, electronics);
        Product laptop = new Product(2L, "Laptop", 999.99, electronics);
        Product apple = new Product(3L, "Apple", 0.99, groceries);
        Product banana = new Product(4L, "Banana", 0.99, groceries);

        manager.addProduct(electronics, phone);
        manager.addProduct(electronics, laptop);
        manager.addProduct(groceries, apple);
        manager.addProduct(groceries, banana);

        System.out.println("Map Products: "+ manager.getProducts());
        System.out.println("Products in Electronics: " + manager.getProductsByType(electronics));
        System.out.println("Products in Groceries: " + manager.getProductsByType(groceries));
    }
}