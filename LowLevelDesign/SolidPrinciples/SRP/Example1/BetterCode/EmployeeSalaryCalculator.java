package LowLevelDesign.SolidPrinciples.SRP.Example1.BetterCode;

public class EmployeeSalaryCalculator {
    public double calculateSalary(Employee employee) {
        // Logic to calculate salary
        double salary = 50000; // Example fixed salary
        System.out.println("Calculating salary for " + employee.getName());
        return salary;
    }
}
