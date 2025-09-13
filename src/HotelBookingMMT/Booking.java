package HotelBookingMMT;

public class Booking {

    private static int counter = 1;
    private String bookingId;
    private User user;
    private Room room;
    private BookingStatus status;

    public Booking(User user,Room room) {
        this.bookingId = "B"+counter++;
        this.room = room;
        this.user = user;
        this.status = BookingStatus.PENDING;
    }

    public void confirmBooking(){
        this.status = BookingStatus.ONGOING;
        room.setAvailable(false);
        System.out.println("Booking "+ bookingId+" confirmed!");
    }

    public void cancelBooking(){
        this.status = BookingStatus.CANCELLED;
        room.setAvailable(true);
        System.out.println("Booking "+ bookingId+" cancelled.");
    }
}
