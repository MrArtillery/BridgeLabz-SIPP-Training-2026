import java.io.*;
import java.util.Scanner;

public class StudentGradeManager {

    static String[] names = new String[100];
    static int[] totals = new int[100];
    static String[] grades = new String[100];
    static int count = 0;

    // Calculate Grade using nested conditions
    static String calculateGrade(int total) {

        double average = total / 5.0;

        if (average >= 90) {
            return "A+";
        } else {
            if (average >= 75) {
                return "A";
            } else {
                if (average >= 60) {
                    return "B";
                } else {
                    if (average >= 40) {
                        return "C";
                    } else {
                        return "F";
                    }
                }
            }
        }
    }

    // Read student data from file
    static void readFile(String fileName) throws IOException {

        BufferedReader br = new BufferedReader(
                new FileReader(fileName));

        String line;

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            String name = data[0];

            int total = 0;

            for (int i = 1; i <= 5; i++) {
                total += Integer.parseInt(data[i]);
            }

            names[count] = name;
            totals[count] = total;
            grades[count] = calculateGrade(total);

            count++;
        }

        br.close();
    }

    // Search by name
    static void searchStudent(String name) {

        for (int i = 0; i < count; i++) {

            if (names[i].equalsIgnoreCase(name)) {

                System.out.println("\nStudent Found");
                System.out.println("Name : " + names[i]);
                System.out.println("Total: " + totals[i]);
                System.out.println("Grade: " + grades[i]);
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    // Bubble Sort by total marks
    static void sortStudents() {

        for (int i = 0; i < count - 1; i++) {

            for (int j = 0; j < count - i - 1; j++) {

                if (totals[j] < totals[j + 1]) {

                    int tempTotal = totals[j];
                    totals[j] = totals[j + 1];
                    totals[j + 1] = tempTotal;

                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;

                    String tempGrade = grades[j];
                    grades[j] = grades[j + 1];
                    grades[j + 1] = tempGrade;
                }
            }
        }
    }

    // Write report to output file
    static void writeReport(String outputFile) throws IOException {

        BufferedWriter bw = new BufferedWriter(
                new FileWriter(outputFile));

        bw.write("Student Report");
        bw.newLine();
        bw.write("---------------------------");
        bw.newLine();

        for (int i = 0; i < count; i++) {

            bw.write(names[i] +
                    " | Total = " + totals[i] +
                    " | Grade = " + grades[i]);

            bw.newLine();
        }

        bw.close();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            readFile("students.txt");

            sortStudents();

            System.out.print("Enter Student Name to Search: ");
            String searchName = sc.nextLine();

            searchStudent(searchName);

            writeReport("report.txt");

            System.out.println("\nReport Generated Successfully");

        } catch (FileNotFoundException e) {

            System.out.println("Input file not found.");

        } catch (IOException e) {

            System.out.println("File handling error.");

        } catch (NumberFormatException e) {

            System.out.println("Invalid marks format.");

        } catch (Exception e) {

            System.out.println("Unexpected Error: " + e);
        }

        sc.close();
    }
}