
public class Employee {

    private String Id;
    private String name;
    private String address;

    public Employee(String id, String name, String address) {
        Id = id;
        this.name = name;
        this.address = address;
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    // Method 1:
    public void printPerformanceReport() {
        // Logic to print performance report
        System.out.println("Printing performance report for " + name);
    }

    // Method 2:
    public double calculateSalary() {
        // Logic to calculate salary
        double salary = 50000; // Example fixed salary
        System.out.println("Calculating salary for " + name);
        return salary;
    }

    // Method 3:
    public void updateEmployeeDetails() {
        System.out.println("Updated details for " + name);
    }

    // Method 4:
    public void saveEmployeeToDatabase() {
        // Logic to save employee details to database
        System.out.println("Saving " + name + " to database");
    }
}

// This Employee class has multiple responsibilities: = Too many reasons to
// change
// 1. Managing employee details -- CRUD operations okay
// 2. Generating performance reports -- depends on reporting format
// 3. Calculating salary -- depends on salary structure & tax rules
// 4. Interacting with the database -- depends on database technology
// If any of these responsibilities change, the Employee class needs to be
// modified,
// violating the Single Responsibility Principle (SRP).
