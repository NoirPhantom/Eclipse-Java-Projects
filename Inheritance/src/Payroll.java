import java.util.Scanner;

public class Payroll {

    static Employee[] employees = new Employee[6];

    static String printMenu() {
        return "Employee types\n\t1. Full-time" + "\n\t2. Part-time\n\t3. Intern" + "\n\t4. Consultant"
                + "\n\t0. Exit system";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int index = 0;
        int userChoice;

        String name;
        String ssn;
        double salary;

        int hoursPerWeek;
        String university;

        boolean isPaid;
        int contractPeriodInMonths;

        do {
            // Printing the menu for user input
            System.out.println("Please enter Employee type: ");
            System.out.println(printMenu());
            userChoice = input.nextInt();
            input.nextLine();

            if (userChoice == 1) {

                // Asking for Full Time employee information
                System.out.println("Enter employee name: ");
                name = input.nextLine();

                System.out.println("Enter employee SSN: ");
                ssn = input.nextLine();

                System.out.println("Enter employee salary: ");
                salary = input.nextDouble();

                // Placing full time into employee array
                employees[index] = new FullTime(name, salary, ssn);
                index++;

            } else if (userChoice == 2) {

                // Asking for Part Time employee informatuon
                System.out.println("Enter employee name: ");
                name = input.nextLine();

                System.out.println("Enter employee SSN: ");
                ssn = input.nextLine();

                System.out.println("Enter employee salary: ");
                salary = input.nextDouble();

                System.out.println("Enter weekly hours: ");
                hoursPerWeek = input.nextInt();

                // Placing part time into employee array
                employees[index] = new PartTime(name, salary, ssn, hoursPerWeek);
                index++;

            } else if (userChoice == 3) {

                System.out.println("Enter employee name: ");
                name = input.nextLine();

                System.out.println("Enter employee SSN: ");
                ssn = input.nextLine();

                System.out.println("Enter employee salary: ");
                salary = input.nextDouble();

                System.out.println("Enter weekly hours: ");
                hoursPerWeek = input.nextInt();

                System.out.println("Enter University name: ");
                university = input.nextLine();

                System.out.println("Is it a paid internship? [true/false]: ");
                isPaid = input.nextBoolean();

                // Placing intern into employee array
                employees[index] = new Intern(name, salary, ssn, hoursPerWeek, university, isPaid);
                index++;

            } else if (userChoice == 4) {

                System.out.println("Enter employee name: ");
                name = input.nextLine();

                System.out.println("Enter employee SSN: ");
                ssn = input.nextLine();

                System.out.println("Enter employee salary: ");
                salary = input.nextDouble();

                System.out.println("Enter contract period: ");
                contractPeriodInMonths = input.nextInt();

                // Placing consultant into employee array
                employees[index] = new Consultant(name, salary, ssn, contractPeriodInMonths);
                index++;

            }
        } while (userChoice != 0 && index != 6);
        System.out.println("Payroll for each employee in employee's array is: ");

        for (int i = 0; i <= index - 1; i++) {
            System.out.println(employees[i].getEmployeeId() + " : " + employees[i].getPay());
        }

        input.close();
    }

}