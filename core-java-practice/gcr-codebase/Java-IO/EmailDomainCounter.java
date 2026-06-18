import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmailDomainCounter {

    public static void main(String[] args) {

        int gmailCount = 0;
        int yahooCount = 0;
        int otherCount = 0;

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("emails.txt"));

            String email;

            while ((email = br.readLine()) != null) {

                int atIndex = email.indexOf('@');

                if (atIndex != -1) {

                    String domain = email.substring(atIndex + 1);

                    if (domain.equalsIgnoreCase("gmail.com")) {
                        gmailCount++;
                    } else if (domain.equalsIgnoreCase("yahoo.com")) {
                        yahooCount++;
                    } else {
                        otherCount++;
                    }
                }
            }

            br.close();

            System.out.println("Gmail Users = " + gmailCount);
            System.out.println("Yahoo Users = " + yahooCount);
            System.out.println("Other Users = " + otherCount);

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
