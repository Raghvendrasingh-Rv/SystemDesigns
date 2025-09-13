package RideBookingUber;

import java.util.Collections;

public class FareCalculator {

    private static final double BASE_FARE=50.0;
    private static final double COST_PER_KM=10.0;

    public static double calculateFare(Location pickup,Location drop){
        double distance = 5.0;
        return BASE_FARE + distance*COST_PER_KM;
    }

}
