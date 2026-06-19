public class UsernameValidator {

    static boolean isValidUsername(String username, int index) {

        // Base Case
        if (index == username.length()) {
            return true;
        }

        char ch = username.charAt(index);

        // Check if character is lowercase letter
        if (ch < 'a' || ch > 'z') {
            return false;
        }

        // Recursive Call
        return isValidUsername(username, index + 1);
    }

    public static void main(String[] args) {

        String username1 = "abcdxyz";
        String username2 = "abcD123";

        System.out.println(isValidUsername(username1, 0));
        System.out.println(isValidUsername(username2, 0));
    }
}
