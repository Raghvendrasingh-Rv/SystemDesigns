package RideBookingUber;

public class Main {

    public static void main(String[] args) {

        Rider r1 = new Rider("01", "RV", "8860285330");
        Driver d1 = new Driver("11", "Santosh", "098540850", true);
        Location pickup = new Location(1.0, 3.0);
        Location drop = new Location(4.0, 7.0);
        Trip t1 = r1.requestTrip(pickup,drop);
        t1.assignDriver(d1);
        d1.acceptTrip(t1);
        d1.completeTrip(t1);
    }
}
