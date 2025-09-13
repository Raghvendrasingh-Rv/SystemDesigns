package RideBookingUber;

public class Trip {

    private static int counter=1;
    private String tripId;
    private Rider rider;
    private Driver driver;
    private Location pickup;
    private Location drop;
    private TripStatus status;
    private double fare;

    public Trip(Rider rider, Location pickup, Location drop) {
        this.tripId = "T" + counter++;
        this.rider = rider;
        this.pickup = pickup;
        this.drop = drop;
        this.status = TripStatus.REQUESTED;
    }

    public void assignDriver(Driver driver){
        this.driver = driver;
        this.status=TripStatus.ONGOING;
        this.fare = FareCalculator.calculateFare(pickup,drop);
        System.out.println("Trip request sent to:" + this.driver.getName());
    }

    public void endTrip(){
        this.status = TripStatus.COMPLETED;
        System.out.println("<Driver Clicked Completed>: Trip Completed. Fare" + this.fare);
    }
}
