package RideBookingUber;

public class Driver extends User{

    private boolean available;

    public Driver(String id, String name, String phone, boolean available) {
        super(id, name, phone);
        this.available = available;
    }

    public void acceptTrip(Trip trip){
        if(this.available){
            trip.assignDriver(this);
            this.available=false;
            System.out.println("Trip accepted by driver"+ this.getName());
        }
    }

    public void completeTrip(Trip trip){
        trip.endTrip();
        this.available=true;
    }
}
