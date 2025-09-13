package ElevatorSystem;

import java.util.ArrayList;
import java.util.List;

public class ElevatorMang {
    List<Elevator> elevators;

    public ElevatorMang(int numOfEle) {
        this.elevators = new ArrayList<>();

        for(int i=0;i<numOfEle;i++){
            elevators.add(new Elevator(0));
        }
    }

    public void addRequest(int start, int end){
        Elevator bestEle = null;
        int minDistance = Integer.MAX_VALUE;

        for(Elevator ele: elevators){
            int currentFloor = ele.getCurretFloor();

            if(minDistance> Math.abs(currentFloor-start)){
                minDistance = Math.abs(currentFloor-start);
                bestEle = ele;
            }
        }
        if(bestEle!=null){
            bestEle.addTask(start);
            bestEle.addTask(end);
        }
    }

    public void run(){
        for(Elevator ele: elevators){
            ele.run();
        }
    }
}
