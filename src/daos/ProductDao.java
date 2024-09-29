package daos;

import models.*;
import java.util.*;
public class ProductDao {
    private final Map<ProductType, List<Product>> productMap=new HashMap<>();

    public ProductDao() {

    }

    public void addProduct(ProductType productType, Product product) {
        productMap.putIfAbsent(productType, new ArrayList<>());
        productMap.get(productType).add(product);
    }

    public List<Product> getProductsByType(ProductType productType) {
        return productMap.getOrDefault(productType, new ArrayList<>());
    }

    public Map<ProductType, List<Product>> getProducts(){
        return this.productMap;
    }
}
