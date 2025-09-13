package EmployeeManagement;

public class Position {
    private String positionId;
    private String title;
    private String level;

    public Position(String positionId, String title, String level) {
        this.positionId = positionId;
        this.title = title;
        this.level = level;
    }

    public String getTitle() {
        return title;
    }

    public String getLevel() {
        return level;
    }
}
