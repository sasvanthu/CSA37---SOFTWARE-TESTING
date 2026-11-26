public class CompoundInterest {
    public static double interest(double principal, double rate, int years) {
        if (principal < 0) {
            throw new IllegalArgumentException("Principal cannot be negative");
        }
        return principal * Math.pow(1 + rate / 100, years) - principal;
    }
}
