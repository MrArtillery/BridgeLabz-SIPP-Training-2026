class Course {

    // Instance Variables
    String courseName;
    int duration;
    double fee;

    // Class Variable
    static String instituteName = "GLA University";

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance Method
    void displayCourseDetails() {

        System.out.println("Course Name : " + courseName);
        System.out.println("Duration    : " + duration + " Months");
        System.out.println("Fee         : ₹" + fee);
        System.out.println("Institute   : " + instituteName);
    }

    // Class Method
    static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {

        Course c1 = new Course("Java", 6, 12000);
        Course c2 = new Course("Python", 4, 10000);

        c1.displayCourseDetails();
        System.out.println();

        Course.updateInstituteName("BridgeLabz");

        c2.displayCourseDetails();
    }
}
