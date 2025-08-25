package LowLevelDesign.SolidPrinciples.SRP.Example1.BetterCode;

public class EmployeeDbContext {
    public void saveEmployeeToDatabase(Employee employee) {
        // Logic to save employee details to database
        System.out.println("Saving " + employee.getName() + " to database");
    }
}
