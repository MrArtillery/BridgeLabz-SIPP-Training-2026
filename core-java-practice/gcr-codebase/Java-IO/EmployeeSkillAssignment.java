import java.io.*;
import java.util.Scanner;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    int employeeId;
    String name;
    String department;
    double salary;

    Employee(int employeeId, String name, String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeSerialization {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Accept data using Scanner
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String dept = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, dept, salary);

            // Serialization
            ObjectOutputStream oos =
                    new ObjectOutputStream(
                            new FileOutputStream("employee.ser"));

            oos.writeObject(emp);
            oos.close();

            System.out.println("Employee object serialized successfully.");

            // Deserialization
            ObjectInputStream ois =
                    new ObjectInputStream(
                            new FileInputStream("employee.ser"));

            Employee recoveredEmp = (Employee) ois.readObject();
            ois.close();

            System.out.println("\nRecovered Employee Information:");
            recoveredEmp.display();

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
        }

        sc.close();
    }
}
