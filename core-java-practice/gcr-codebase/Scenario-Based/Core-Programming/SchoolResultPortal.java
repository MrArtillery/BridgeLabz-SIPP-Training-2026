import java.io.*;

public class SchoolResultPortal {

    public static void main(String[] args) {

        String inputFile = "students.txt";
        String outputFile = "reportcard.txt";

        try (
                BufferedReader br = new BufferedReader(new FileReader(inputFile));

                // true = append mode (prevents overwriting)
                BufferedWriter bw = new BufferedWriter(
                        new FileWriter(outputFile, true))
        ) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];
                int mark1 = Integer.parseInt(data[1]);
                int mark2 = Integer.parseInt(data[2]);
                int mark3 = Integer.parseInt(data[3]);

                double average = (mark1 + mark2 + mark3) / 3.0;

                bw.write("Student: " + name);
                bw.newLine();

                bw.write("Marks: " + mark1 + ", " + mark2 + ", " + mark3);
                bw.newLine();

                bw.write("Average: " + average);
                bw.newLine();

                bw.write("------------------------");
                bw.newLine();
            }

            System.out.println("Report cards generated successfully.");

        } catch (FileNotFoundException e) {

            System.out.println("Error: Student file not found.");

        } catch (IOException e) {

            System.out.println("Error while processing file.");

        } catch (NumberFormatException e) {

            System.out.println("Invalid marks format in file.");
        }
    }
}