package HotelBookingMMT;

public class Main {

    public static void main(String[] args) {
        User u1 = new User("1", "RV","rv@gmail.com");
        Hotel h1 = new Hotel("1", "Maa Sharda");
        Room r1 = new Room("1","Double", 1000.0,true);
        Room r2 = new Room("2","Single", 800.0,true);
        h1.addRoom(r1);
        h1.addRoom(r2);

        //book r1

        Booking b1 = u1.bookRoom(r1);

        b1.confirmBooking();
        b1.cancelBooking();
    }
}
