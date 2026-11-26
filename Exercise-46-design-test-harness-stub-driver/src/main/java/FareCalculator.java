public class FareCalculator {
    private static final int BASE_FARE = 50;
    private static final int RATE_PER_KM = 12;
    private final DistanceService distanceService;
    public FareCalculator(DistanceService distanceService) {
        this.distanceService = distanceService;
    }
    public int fare(String from, String to) {
        int km = distanceService.getDistanceKm(from, to);
        if (km < 0) {
            throw new IllegalStateException("Invalid distance");
        }
        return BASE_FARE + km * RATE_PER_KM;
    }
}
