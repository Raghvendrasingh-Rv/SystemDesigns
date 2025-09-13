package HotelBookingMMT;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String id;
    private String name;
    private ArrayList<Room> rooms;

    public Hotel(String id, String name) {
        this.id = id;
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public List<Room> getAvailableRoom(){
        return rooms.stream().filter(room -> room.isAvailable()==true).toList();
    }
}
