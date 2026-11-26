import java.util.ArrayList;
import java.util.List;
public class IntStack {
    private final List<Integer> data = new ArrayList<>();
    public void push(int x) { data.add(x); }
    public int pop() {
        if (data.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return data.remove(data.size() - 1);
    }
    public int peek() {
        if (data.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return data.get(data.size() - 1);
    }
    public boolean isEmpty() { return data.isEmpty(); }
    public int size() { return data.size(); }
}
