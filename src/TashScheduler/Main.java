package TashScheduler;

public class Main {
    public static void main(String[] args) {
        TaskManager tm = new TaskManager();

        Task t1 = new Task(1, "Sleep", 1);
        Task t2 = new Task(2, "Game", 6);
        Task t3 = new Task(3, "Bath", 3);
        Task t4 = new Task(4, "Study", 9);

        tm.addTask(t1);
        tm.addTask(t2);
        tm.addTask(t3);
        tm.addTask(t4);

        tm.executeTask();

        tm.updatePriority(t3,8);

        tm.executeTask();
        tm.executeTask();
        tm.executeTask();

    }
}