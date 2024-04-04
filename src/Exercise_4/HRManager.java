package Exercise_4;

public class HRManager extends Employee{
    public HRManager(int salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("\n Managing employees");
    }

    public void addEmployee(){
        System.out.println("\n Adding new employee");
    }
}
