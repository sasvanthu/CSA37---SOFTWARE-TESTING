import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CartTest {
    @Test @Tag("smoke") @Tag("regression") void addItemIncreasesSize() {
        CartService cart = new CartService();
        cart.addItem("Pen", 10);
        assertEquals(1, cart.size());
    }
    @Test @Tag("regression") void removeItemWorks() {
        CartService cart = new CartService();
        cart.addItem("Pen", 10);
        assertTrue(cart.removeItem("Pen"));
        assertEquals(0, cart.size());
    }
    @Test @Tag("regression") void totalOfTwoItems() {
        CartService cart = new CartService();
        cart.addItem("Pen", 100);
        cart.addItem("Book", 250);
        assertEquals(350, cart.total(), 0.001);
    }
    @Test @Tag("smoke") void emptyCartTotalIsZero() {
        assertEquals(0, new CartService().total(), 0.001);
    }
    @Test @Tag("regression") void discountIsApplied() {
        CartService cart = new CartService();
        cart.addItem("Pen", 100);
        cart.addItem("Book", 250);
        assertEquals(315, cart.totalWithDiscount(10), 0.001);
    }
}
