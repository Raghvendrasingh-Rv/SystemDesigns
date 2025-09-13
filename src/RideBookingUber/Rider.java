package RideBookingUber;

public class Rider extends User{

    public Rider(String id, String name, String phone) {
        super(id, name, phone);
    }

    public Trip requestTrip(Location pickup, Location drop){
        System.out.println("<Rider Clicked Book>: Ride requested by"+ this.getName());
        return new Trip(this,pickup,drop);
    }
}
