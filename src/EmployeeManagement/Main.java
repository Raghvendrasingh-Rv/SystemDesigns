package EmployeeManagement;

public class Main {

    public static void main(String[] args) {

        Department it = new Department("1","IT");
        Department hr = new Department("2","HR");

        Position dev = new Position("1","Developer", "Junior");
        Position manager = new Position("2","Manager", "Senior");

        Employee e1 = new Employee("1","RV",it,dev);
        Employee e2 = new Employee("2","Singh",it,dev);
        Employee e3 = new Employee("3","Hustler",hr,manager);
        Employee e4 = new Employee("4","Demon",hr,manager);

        Salary s1 = new Salary(50000.0,20000.0);
        Salary s2 = new Salary(40000.0,10000.0);
        Salary s3 = new Salary(60000.0,20000.0);
        Salary s4 = new Salary(80000.0,10000.0);

        e1.setSalary(s1);
        e2.setSalary(s2);
        e3.setSalary(s3);
        e4.setSalary(s4);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

    }
}
