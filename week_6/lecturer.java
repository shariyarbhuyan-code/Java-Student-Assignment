public class Lecturer extends Employee {
    private String subject;

    // Constructor
    public Lecturer(String id, String name, String department, String subject) {
        super(id, name, department);
        this.subject = subject;
    }

    // Method to display the subject and department
    public void displaySubject() {
        System.out.println("Subject     : " + subject);
        System.out.println("Department  : " + department);
    }
}
