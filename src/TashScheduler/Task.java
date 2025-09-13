package TashScheduler;

public class Task {

    private int TaskId;
    private String name;
    private int priority;

    public Task(int taskId, String name, int priority) {
        TaskId = taskId;
        this.name = name;
        this.priority = priority;
    }

    public int getTaskId() {
        return TaskId;
    }

    public void setTaskId(int taskId) {
        TaskId = taskId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
