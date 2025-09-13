package ParkingSystem;

public class ParkingSlot {

    private int slotId;
    private VehicleType slotType;
    private boolean isAvailable;

    public ParkingSlot(int slotId, VehicleType slotType) {
        this.slotId = slotId;
        this.slotType = slotType;
        this.isAvailable = true;
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public VehicleType getSlotType() {
        return slotType;
    }

    public void setSlotType(VehicleType slotType) {
        this.slotType = slotType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
