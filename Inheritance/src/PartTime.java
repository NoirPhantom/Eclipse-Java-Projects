public class PartTime extends Employee {
    private int hoursPerWeek;

    public PartTime(String name, double salary, String ssn, int hoursPerWeek) {
        super(name, salary, ssn);
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    double getPay() {
        return this.salary * this.hoursPerWeek * 2;
    }
}
