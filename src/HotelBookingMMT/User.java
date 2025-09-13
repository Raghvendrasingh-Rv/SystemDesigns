package HotelBookingMMT;

public class User {

    private String id;
    private String name;
    private String email;

    public User(String id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Booking bookRoom(Room room){
        if(room.isAvailable()){
            Booking booking = new Booking(this,room);
            room.setAvailable(false);
            System.out.println("Booking created for user: "+ this.name);
            return booking;
        }else{
            System.out.println("Room is not available.");
            return null;
        }
    }
}
