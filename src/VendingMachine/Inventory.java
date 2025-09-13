package VendingMachine;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    Map<Integer,Product> products = new HashMap<>();
    Map<Integer,Integer> quantities = new HashMap<>();

    public void addProducts(Product product, int quantity) {
        products.put(product.id, product);
        quantities.put(product.id, quantity);
    }

    public Product checkProduct(int code){
        if(quantities.containsKey(code)){
            return products.get(code);
        }
        return null;
    }

    public void soldProduct(int code){
        quantities.put(code,quantities.get(code)-1);
        System.out.println("Quantity reduced");
    }

    public Map<Integer, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, Product> products) {
        this.products = products;
    }

    public Map<Integer, Integer> getQuantities() {
        return quantities;
    }

    public void setQuantities(Map<Integer, Integer> quantities) {
        this.quantities = quantities;
    }
}
