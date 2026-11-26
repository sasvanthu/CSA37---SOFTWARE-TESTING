import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PayrollPathTest {
    private static final double DELTA = 0.01;
    @Test
    void path1_noOvertime_noTax() {
        assertEquals(20000, Payroll.netSalary(20000, 0), DELTA);
    }
    @Test
    void path2_overtime_noTax() {
        assertEquals(22000, Payroll.netSalary(20000, 10), DELTA);
    }
    @Test
    void path3_tenPercentTax() {
        assertEquals(27000, Payroll.netSalary(30000, 0), DELTA);
    }
    @Test
    void path4_twentyPercentTax() {
        assertEquals(48000, Payroll.netSalary(60000, 0), DELTA);
    }
}
