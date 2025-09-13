package EmployeeManagement;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String departmentId;
    private String name;
    private List<Employee> employees;

    public Department(String departmentId, String name) {
        this.departmentId = departmentId;
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp){
        employees.add(emp);
    }
    public List<Employee> getEmployees(){
        return employees;
    }

    public String getName(){
        return this.name;
    }
}
