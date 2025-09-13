package ParkingSystem;

import java.util.ArrayList;
import java.util.List;

public class ParkingStation {

    List<ParkingSlot> slots;

    public ParkingStation() {
        this.slots = new ArrayList<>();
    }

    public void addSlot(ParkingSlot ps){
        slots.add(ps);
    }

    public Ticket park(Vehicle v){
        if(slots.size()==0){
            System.out.println("No slot available");
            return null;
        }
        for(ParkingSlot slot: slots){
            if(slot.isAvailable()&&slot.getSlotType()==v.getVehicleType()){
                Ticket t = new Ticket(v,slot);
                slot.setAvailable(false);
                System.out.println("Vehicle Parked: "+ v.getNumber());
                return t;
            }
            System.out.println("No slot free for Vehicle number: "+ v.getNumber());
        }
        return null;
    }

    public int unPark(Ticket t){
        if(t!=null){
            t.setExitTime();
            int price = t.calculatePrice();
            t.getSlot().setAvailable(true);
            System.out.println("Vehicle unParked: "+ t.getVehicle().getNumber());
            return price;
        }
        System.out.println("No ticket found with this number");
        return 0;
    }
}
