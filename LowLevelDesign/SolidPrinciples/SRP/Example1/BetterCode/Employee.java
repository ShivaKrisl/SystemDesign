package LowLevelDesign.SolidPrinciples.SRP.Example1.BetterCode;

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

    // Method 3:
    public void updateEmployeeDetails() {
        System.out.println("Updated details for " + name);
    }

}
