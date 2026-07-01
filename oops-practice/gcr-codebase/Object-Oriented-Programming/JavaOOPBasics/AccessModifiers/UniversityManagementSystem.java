class Student {

    public int rollNumber;
    protected String name;
    private double cgpa;

    Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class PostgraduateStudent extends Student {

    PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

    void display() {
        System.out.println("Roll No : " + rollNumber);
        System.out.println("Name    : " + name);
        System.out.println("CGPA    : " + getCGPA());
    }
}

public class UniversityManagementSystem {

    public static void main(String[] args) {

        PostgraduateStudent s =
                new PostgraduateStudent(101, "Ankur", 8.8);

        s.display();

        s.setCGPA(9.2);

        System.out.println("Updated CGPA : " + s.getCGPA());
    }
}
