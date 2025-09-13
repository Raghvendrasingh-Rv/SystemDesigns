package EmployeeManagement;

public class Salary {

    private double FixedSalary;
    private double VariableSalary;

    public Salary(double fixedSalary, double variableSalary) {
        FixedSalary = fixedSalary;
        VariableSalary = variableSalary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "FixedSalary=" + FixedSalary +
                ", VariableSalary=" + VariableSalary +
                '}';
    }
}
