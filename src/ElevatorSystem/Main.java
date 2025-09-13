package ElevatorSystem;

public class Main {

    public static void main(String[] args) {
        ElevatorMang em = new ElevatorMang(2);

        em.addRequest(3,9);
        em.addRequest(4,1);

        for(int i=0;i<23;i++){
            em.run();
        }
    }
}
