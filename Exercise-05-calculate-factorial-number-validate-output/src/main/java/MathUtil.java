public class MathUtil {
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative number");
        }
        long f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}
