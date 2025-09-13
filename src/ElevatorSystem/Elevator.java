package ElevatorSystem;

import com.sun.net.httpserver.Request;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Elevator {
    private int currentFloor;
    private Direction direction;
    private DoorState doorState;
    private Queue<Integer> tasks;

    public Elevator(int curretFloor) {
        this.currentFloor = curretFloor;
        this.direction = Direction.IDLE;
        this.doorState = DoorState.OPEN;
        this.tasks = new LinkedList<>();
    }

    public void run(){
        if(tasks.isEmpty()){
            this.direction = Direction.IDLE;
            System.out.println("This elevator is in idle state: at"+ currentFloor);
            return;
        }

        int target = tasks.peek();

        if(target>currentFloor){
            direction = Direction.UP;
            currentFloor++;
            System.out.println("Going up: at" + currentFloor);
        }else if(target<currentFloor){
            direction = Direction.DOWN;
            currentFloor--;
            System.out.println("Going down: at"+ currentFloor);
        }else{
            openDoor();
            tasks.poll();
            System.out.println("We reached at: "+currentFloor);
            closeDoor();
        }

    }

    public void openDoor(){
        this.doorState = DoorState.OPEN;
    }
    public void closeDoor(){
        this.doorState = DoorState.CLOSED;
    }

    public void addTask(int floor){
        tasks.add(floor);
    }

    public int getCurretFloor() {
        return currentFloor;
    }

    public void setCurretFloor(int curretFloor) {
        this.currentFloor = curretFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public DoorState getDoorState() {
        return doorState;
    }

    public void setDoorState(DoorState doorState) {
        this.doorState = doorState;
    }

    public Queue<Integer> getTasks() {
        return tasks;
    }

    public void setTasks(Queue<Integer> tasks) {
        this.tasks = tasks;
    }
}
