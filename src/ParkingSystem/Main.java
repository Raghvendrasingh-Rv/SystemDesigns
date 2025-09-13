package ParkingSystem;

public class Main {

    public static void main(String[] args) {
        ParkingStation ps = new ParkingStation();
        ParkingSlot s1 = new ParkingSlot(1,VehicleType.BIKE);
        ParkingSlot s2 = new ParkingSlot(2,VehicleType.CAR);
        ParkingSlot s3 = new ParkingSlot(3,VehicleType.BUS);

        ps.addSlot(s1);
        ps.addSlot(s2);
        ps.addSlot(s3);


        Vehicle v1 = new Vehicle("MP5555",VehicleType.BIKE);

        Ticket t1 = ps.park(v1);
        int p1 = ps.unPark(t1);
        System.out.println("Ticket price is: "+ p1+", for vehicle number: "+ v1.getNumber());

        Vehicle v2 = new Vehicle("MP4444",VehicleType.BIKE);
        Ticket t2 = ps.park(v2);

        Vehicle v3 = new Vehicle("MP3333",VehicleType.BIKE);
        Ticket t3 = ps.park(v3);

        int p2 = ps.unPark(t2);
        System.out.println("Ticket price is: "+ p2+", for vehicle number: "+ v2.getNumber());
    }
}
