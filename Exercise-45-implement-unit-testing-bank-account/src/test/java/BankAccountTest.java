import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BankAccountTest {
    private BankAccount account;
    @BeforeEach void setUp() {
        account = new BankAccount("ACC1001", 5000);
    }
    @Test void initialBalanceIsStored() {
        assertEquals(5000, account.getBalance(), 0.001);
    }
    @Test void depositIncreasesBalance() {
        account.deposit(1000);
        assertEquals(6000, account.getBalance(), 0.001);
    }
    @Test void withdrawDecreasesBalance() {
        account.withdraw(2000);
        assertEquals(3000, account.getBalance(), 0.001);
    }
    @Test void withdrawMoreThanBalanceThrows() {
        assertThrows(IllegalStateException.class, () -> account.withdraw(6000));
    }
    @Test void negativeDepositThrows() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-100));
    }
    @Test void negativeOpeningBalanceThrows() {
        assertThrows(IllegalArgumentException.class, () -> new BankAccount("ACC1002", -1));
    }
}
