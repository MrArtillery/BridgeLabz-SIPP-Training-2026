public class SpyAgency {

    public static void main(String[] args) {

        String message = "madam";

        // Reverse String
        String reversed = "";

        for (int i = message.length() - 1; i >= 0; i--) {
            reversed += message.charAt(i);
        }

        System.out.println("Original Message: " + message);
        System.out.println("Reversed Message: " + reversed);

        // Palindrome Check
        if (message.equalsIgnoreCase(reversed)) {
            System.out.println("Message is a Palindrome");
        } else {
            System.out.println("Message is not a Palindrome");
        }

        // Count Vowels and Consonants
        int vowels = 0, consonants = 0;

        for (int i = 0; i < message.length(); i++) {

            char ch = Character.toLowerCase(message.charAt(i));

            if (Character.isLetter(ch)) {

                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);

        // Anagram Check
        String intercept1 = "listen";
        String intercept2 = "silent";

        char[] arr1 = intercept1.toCharArray();
        char[] arr2 = intercept2.toCharArray();

        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        if (java.util.Arrays.equals(arr1, arr2)) {
            System.out.println("Intercepts are Anagrams");
        } else {
            System.out.println("Intercepts are not Anagrams");
        }

        // First Non-Repeating Character
        String log = "swiss";
        char firstNonRepeating = '\0';

        for (int i = 0; i < log.length(); i++) {

            char ch = log.charAt(i);

            if (log.indexOf(ch) == log.lastIndexOf(ch)) {
                firstNonRepeating = ch;
                break;
            }
        }

        if (firstNonRepeating != '\0') {
            System.out.println("First Non-Repeating Character: "
                    + firstNonRepeating);
        } else {
            System.out.println("No Non-Repeating Character Found");
        }
    }
}