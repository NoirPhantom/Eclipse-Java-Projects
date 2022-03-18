public class FullTime extends Employee {

    public FullTime(String name, double salary, String ssn) {
        super(name, salary, ssn);
    }

    double calculateBonus() {
        return this.salary * 0.15;
    }

    @Override
    double getPay() {
        return this.salary / 26;
    }
}
