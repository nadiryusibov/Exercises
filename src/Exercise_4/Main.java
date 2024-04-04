package Exercise_4;

public class Main {
    // Write a Java program to create a class called Employee with methods called work() and getSalary().
    // Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().

    public static void main(String[] args) {
        Employee employee = new Employee(1500);
        HRManager hrManager = new HRManager(1800);

        employee.work();
        System.out.println("Employee salary: " + employee.getSalary());

        hrManager.work();
        System.out.println("Manager salary: " + hrManager.getSalary());
        hrManager.addEmployee();
    }

}
