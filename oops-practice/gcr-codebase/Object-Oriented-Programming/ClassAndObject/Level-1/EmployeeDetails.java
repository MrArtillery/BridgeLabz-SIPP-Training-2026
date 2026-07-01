class Employee {

    String name;
    int id;
    double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + id);
        System.out.println("Salary        : ₹" + salary);
    }
}

public class EmployeeDetails {

    public static void main(String[] args) {

        Employee emp = new Employee("Ankur", 101, 50000);

        emp.displayDetails();
    }
}
