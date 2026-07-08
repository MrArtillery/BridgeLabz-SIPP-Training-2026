import java.util.ArrayList;
import java.util.HashMap;

public class SmartClassroomAttendanceTracker {

    private HashMap<String, ArrayList<String>> attendanceMap = new HashMap<>();

    // 1. Mark attendance
    public void markAttendance(String subject, String studentName) {

        attendanceMap.putIfAbsent(subject, new ArrayList<>());

        ArrayList<String> students = attendanceMap.get(subject);

        // 2. Prevent duplicate attendance
        if (students.contains(studentName)) {
            System.out.println(studentName + " is already marked present in " + subject);
        } else {
            students.add(studentName);
            System.out.println("Attendance marked: " + studentName + " in " + subject);
        }
    }

    // 3. Display attendance list for each subject
    public void displayAttendance() {
        System.out.println("\nAttendance Record:");
        for (String subject : attendanceMap.keySet()) {
            ArrayList<String> students = attendanceMap.get(subject);
            System.out.println("Subject: " + subject);
            System.out.println("Students Present: " + students);
            System.out.println("Total Present: " + students.size());
            System.out.println();
        }
    }

    public static void main(String[] args) {

        SmartClassroomAttendanceTracker tracker =
                new SmartClassroomAttendanceTracker();

        tracker.markAttendance("Java", "Ankur");
        tracker.markAttendance("Java", "Rahul");
        tracker.markAttendance("Python", "Priya");
        tracker.markAttendance("Java", "Ankur");   // duplicate
        tracker.markAttendance("Python", "Rahul");
        tracker.markAttendance("DBMS", "Aman");

        tracker.displayAttendance();
    }
}
