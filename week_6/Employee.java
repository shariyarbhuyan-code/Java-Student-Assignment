public class Employee {
    protected String id;
    protected String name;
    protected String department;

    // Constructor
    public Employee(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Method to display info
    public void displayInfo() {
        System.out.println("Employee ID : " + id);
        System.out.println("Name        : " + name);
    }
}
