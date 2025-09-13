package EmployeeManagement;

public class Employee {

    private String id;
    private String name;
    private Department department;
    private Position position;
    private Salary salary;

    public Employee(String id, String name, Department department, Position position) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public Position getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", department=" + department.getName() +
                ", position=" + position.getTitle() +
                ", salary=" + salary.toString() +
                '}';
    }
}
