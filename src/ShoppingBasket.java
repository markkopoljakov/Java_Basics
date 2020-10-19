import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingBasket {
    private List<Purchase> purchases;

    public ShoppingBasket() {
        this.purchases = new ArrayList<Purchase>();
    }

    public void add(String product, int price) {

        Purchase purchase = new Purchase(product, 1, price);

        if (!this.purchases.contains(purchase)) {
            this.purchases.add(purchase);
        } else {
            purchase.increaseAmount();
        }
    }

    public int price() {
        int price = 0;
        for (Purchase item : purchases) {
            price += item.price();
        }
        return price;
    }

    public void print() {

        Map<String, Integer> test = new HashMap<String, Integer>();

        for (Purchase item : purchases) {
            String itemName = item.name();

            if (test.containsKey(itemName)) {
                test.put(itemName, test.get(itemName) + 1);
            } else {
                test.put(itemName, 1);
            }
        }

        for (String key : test.keySet()) {
            System.out.println(key + ": " + test.get(key));

        }
    }
}
