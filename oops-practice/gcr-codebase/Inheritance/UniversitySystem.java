class Person {

    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Student extends Person {

    protected final String studentId;
    protected double gpa;

    public Student(String name, int age, String studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Student ID: " + studentId
                + ", GPA: " + gpa;
    }
}

class GradStudent extends Student {

    private String thesis;

    public GradStudent(String name, int age,
                       String studentId,
                       double gpa,
                       String thesis) {

        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Thesis: " + thesis;
    }
}

public class UniversitySystem {

    public static void main(String[] args) {

        GradStudent grad =
                new GradStudent(
                        "Ankur",
                        21,
                        "CS101",
                        8.9,
                        "Artificial Intelligence");

        System.out.println(grad);

        // Demonstrating IS-A relationship

        Student student = grad; // GradStudent IS-A Student
        Person person = grad;   // GradStudent IS-A Person

        System.out.println("\nIS-A Relationship Demonstration:");
        System.out.println(student);
        System.out.println(person);
    }
}
