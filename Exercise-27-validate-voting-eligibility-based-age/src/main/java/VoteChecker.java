public class VoteChecker {
    public static boolean isEligible(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid age");
        }
        return age >= 18;
    }
}
