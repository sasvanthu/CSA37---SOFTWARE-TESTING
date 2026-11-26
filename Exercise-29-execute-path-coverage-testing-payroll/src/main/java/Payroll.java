public class Payroll {
    public static double netSalary(double basic, int overtimeHours) {
        double gross = basic;
        if (overtimeHours > 0) {
            gross += overtimeHours * 200;
        }
        double tax;
        if (gross > 50000) {
            tax = gross * 0.20;
        } else if (gross > 25000) {
            tax = gross * 0.10;
        } else {
            tax = 0;
        }
        return gross - tax;
    }
}
