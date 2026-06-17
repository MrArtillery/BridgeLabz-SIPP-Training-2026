import java.util.Scanner;

public class StudentGrade2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();

        double[][] marks = new double[students][3];

        double[] percentage = new double[students];
        String[] grade = new String[students];

        for (int i = 0; i < students; i++) {

            System.out.println("Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < students; i++) {

            double total = 0;

            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            percentage[i] = total / 3;

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
