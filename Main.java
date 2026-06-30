public class Main {

    public static void main(String[] args) {
        
        // 1. Create an instance of the Student class
        Student student = new Student();

        // 2. Display initial student variables
        System.out.println("Student Name is " + student.name);
        System.out.println("Student id is " + student.id);
        System.out.println("Student is in " + student.className);
        System.out.println("Student is in " + student.program);
        System.out.println("is the student running?: " + student.isRunning);

        // 3. Call the start method and print updated state
        student.start();
        System.out.println("is the student running?: " + student.isRunning);

        // 4. Call the stop method
        student.stop();
    }
}
