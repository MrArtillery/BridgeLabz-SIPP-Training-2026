abstract class Employee {

    // Private fields
    private int employeeId;
    private String employeeName;

    // Constructor
    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    // Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // Abstract Method
    public abstract double calculateSalary();

    // Concrete Method
    public void displayEmployeeInfo() {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
    }
}

class FullTimeEmployee extends Employee {

    // Private field
    private double monthlySalary;

    public FullTimeEmployee(int employeeId,
                            String employeeName,
                            double monthlySalary) {

        super(employeeId, employeeName);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {

    // Private fields
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId,
                            String employeeName,
                            int hoursWorked,
                            double hourlyRate) {

        super(employeeId, employeeName);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class EmployeePayrollSystem {

    public static void main(String[] args) {

        FullTimeEmployee emp1 =
                new FullTimeEmployee(101,
                        "Ankur",
                        50000);

        PartTimeEmployee emp2 =
                new PartTimeEmployee(102,
                        "Rahul",
                        80,
                        250);

        System.out.println("Full Time Employee");
        emp1.displayEmployeeInfo();
        System.out.println("Salary : ₹" + emp1.calculateSalary());

        System.out.println();

        System.out.println("Part Time Employee");
        emp2.displayEmployeeInfo();
        System.out.println("Salary : ₹" + emp2.calculateSalary());
    }
}
