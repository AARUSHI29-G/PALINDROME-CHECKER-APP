public class UseCase1PalindromeCheckerApp {

    /**
     * Application entry point.
     */
    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");
        System.out.println("-----------------------------------");

        // Hardcoded string
        String input = "madam";

        // Method 1: Using character comparison
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome (Method 1)");
        } else {
            System.out.println(input + " is NOT a Palindrome (Method 1)");
        }

        // Method 2: Reverse string and compare
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        if (input.equals(reversed)) {
            System.out.println(input + " is a Palindrome (Method 2)");
        } else {
            System.out.println(input + " is NOT a Palindrome (Method 2)");
        }
    }
}