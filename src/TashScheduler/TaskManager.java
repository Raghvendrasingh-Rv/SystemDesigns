package TashScheduler;

import java.util.*;

public class TaskManager {

    private PriorityQueue<Task> maxHeap;
    private Map<Integer,Task> map;

    public TaskManager() {
        this.maxHeap = new PriorityQueue<>((a,b)->b.getPriority()-a.getPriority());
        this.map = new HashMap<>();
    }

    public void addTask(Task t){
        map.put(t.getTaskId(), t);
        maxHeap.add(t);
        System.out.println("Task created");
    }

    public void updatePriority(Task oldT, int p){
        if(map.containsKey(oldT.getTaskId())){
            maxHeap.remove(oldT);
            oldT.setPriority(p);
            map.put(oldT.getTaskId(),oldT);
            maxHeap.add(oldT);
        }else{
            System.out.println("No task present to update");
        }
    }

    public void deleteTask(Task t){
        if(map.containsKey(t.getTaskId())){
            maxHeap.remove(t);
            map.remove(t.getTaskId());
        }else{
            System.out.println("No task present to delete");
        }
    }

    public void executeTask(){
        if(!maxHeap.isEmpty()){
            Task peek = maxHeap.peek();
            System.out.println("Task id: " + peek.getTaskId()+" with task name: "+peek.getName()+" executed!");
            maxHeap.poll();
            map.remove(peek.getTaskId());
        }else{
            System.out.println("No task present to execute");
        }
    }

}
