class PalindromeChecker {

    String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check palindrome
    public boolean isPalindrome() {

        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        return text.equalsIgnoreCase(reversed);
    }

    // Method to display result
    public void displayResult() {

        System.out.println("Text : " + text);

        if (isPalindrome()) {
            System.out.println("Result : It is a Palindrome.");
        } else {
            System.out.println("Result : It is not a Palindrome.");
        }
    }
}

public class PalindromeProgram {

    public static void main(String[] args) {

        PalindromeChecker checker =
                new PalindromeChecker("Madam");

        checker.displayResult();
    }
}
