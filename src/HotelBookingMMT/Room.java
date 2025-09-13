package HotelBookingMMT;

public class Room {

    private String roomId;
    private String type;
    private double price;
    private boolean isAvailable;

    public Room(String roomId, String type, double price, boolean isAvailable) {
        this.roomId = roomId;
        this.type = type;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}
