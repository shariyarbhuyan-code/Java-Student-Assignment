public class main {
    public static void main(String[] args) {
        // Create a Lecturer object with the required assignment values
        Lecturer lecturer = new Lecturer("L100", "Dr Ahmad", "Faculty of Information Technology", "Java Programming");

        // Call methods to print the expected output
        lecturer.displayInfo();
        lecturer.displaySubject();
    }
}
