package ParkingSystem;

import java.time.LocalDateTime;

public class Ticket {
    int counter=0;
    private int ticketId;
    private Vehicle vehicle;
    private ParkingSlot slot;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    public Ticket(Vehicle vehicle, ParkingSlot slot) {
        this.ticketId = counter++;
        this.vehicle = vehicle;
        this.slot = slot;
        this.entryTime = LocalDateTime.now();

    }

    public void setExitTime(){
        exitTime = LocalDateTime.now().plusHours(2);
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSlot getSlot() {
        return slot;
    }

    public void setSlot(ParkingSlot slot) {
        this.slot = slot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    int bikeCharge=10;
    int carCharge=20;
    int busCharge=50;

    public int calculatePrice(){
        long difference = java.time.Duration.between(entryTime,exitTime).toMinutes();
        int multiple = 1;
        if(slot.getSlotType()==VehicleType.BIKE) {
            multiple = bikeCharge;
        }else if(slot.getSlotType()==VehicleType.CAR) {
            multiple = carCharge;
        }else if(slot.getSlotType()==VehicleType.BUS) {
            multiple = busCharge;
        }else{
            multiple=1;
        }
        return (int)difference*multiple;
    }

}
