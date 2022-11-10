package HW5;

public class Employee {
    //name is package private
    String name;
    private int employeeId;
    private Department department;

    public Employee(Department department) {
        this.department = department;
    }

}
