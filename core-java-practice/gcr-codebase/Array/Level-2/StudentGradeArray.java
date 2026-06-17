import java.util.Scanner;

public class StudentGradeArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();

        double[] physics = new double[students];
        double[] chemistry = new double[students];
        double[] maths = new double[students];

        double[] percentage = new double[students];
        String[] grade = new String[students];

        for (int i = 0; i < students; i++) {

            System.out.println("Student " + (i + 1));

            physics[i] = sc.nextDouble();
            chemistry[i] = sc.nextDouble();
            maths[i] = sc.nextDouble();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid Marks");
                i--;
            }
        }

        for (int i = 0; i < students; i++) {

            percentage[i] =
                    (physics[i] + chemistry[i] + maths[i]) / 3;

            if (percentage[i] >= 80)
                grade[i] = "A";
            else if (percentage[i] >= 70)
                grade[i] = "B";
            else if (percentage[i] >= 60)
                grade[i] = "C";
            else if (percentage[i] >= 50)
                grade[i] = "D";
            else if (percentage[i] >= 40)
                grade[i] = "E";
            else
                grade[i] = "R";
        }

        for (int i = 0; i < students; i++) {

            System.out.println(
                    "Student " + (i + 1) +
                    " Percentage = " + percentage[i] +
                    " Grade = " + grade[i]);
        }
    }
}
