import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private Map<String, Integer> productPrice;
    private Map<String, Integer> productStock;

    public Storehouse() {
        this.productPrice = new HashMap<String, Integer>();
        this.productStock = new HashMap<String, Integer>();
    }
    public void addProduct(String product, int price, int stock) {
        this.productPrice.put(product, price);
        this.productStock.put(product, stock);
    }
    public int price(String product){
        if (this.productPrice.containsKey(product)){
            return this.productPrice.get(product);
        }
        else {
            return -99;
        }
    }
    public int stock(String product){
        if (this.productStock.containsKey(product)){
            return this.productStock.get(product);
        }else{
            return 0;
        }
    }
    public boolean taken(String product){
        if (this.productStock.containsKey(product) && this.productStock.get(product) > 0){
            this.productStock.put(product, this.productStock.get(product) -1);
            return true;
        }else {
            return false;
        }
    }
    public Set<String> products(){
        Set<String> product = new HashSet<String>();
        for (String key : this.productStock.keySet()){
            product.add(key);

        }
        return product;
    }

}
