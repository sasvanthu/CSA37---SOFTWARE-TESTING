import java.util.LinkedHashMap;
import java.util.Map;
public class CartService {
    private final Map<String, Double> items = new LinkedHashMap<>();
    public void addItem(String name, double price) { items.put(name, price); }
    public boolean removeItem(String name) { return items.remove(name) != null; }
    public int size() { return items.size(); }
    public double total() {
        return items.values().stream().mapToDouble(Double::doubleValue).sum();
    }
    public double totalWithDiscount(double percent) {
        return total() * (100 - percent) / 100;
    }
}
