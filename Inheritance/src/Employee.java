public abstract class Employee {
    protected String name;
    protected double salary;
    protected String ssn;

    protected final int employeeId;
    static int nextId = 1;

    public Employee(String name, double salary, String ssn) {
        this.name = name;
        this.salary = salary;
        this.ssn = ssn;
        this.employeeId = nextId++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    abstract double getPay();

    @Override
    public String toString() {
        return "Employee [EmployeeId = " + employeeId + ", Name = " + name + ", Salary = " + salary + ", SSN = " + ssn
                + "]";
    }

}