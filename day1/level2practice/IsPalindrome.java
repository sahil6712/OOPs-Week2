import java.util.Scanner;

class PalindromeChecker {
    // Class attributr
    String text = "Ama";

    PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check the text is palindrome or not

    public void isPalindrome(String text) {
        int len = text.length(); //Storing length of text

        //Checking for palindrome by comparing first and last letters
        for(int i=0; i<(len/2); i++) {

            if(text.charAt(i) != text.charAt(len-i-1)) {
                System.out.println("The text is not palindrome: ");
                return;
            }
        }
        System.out.println("The text is palindrone: ");
        return;
    }
}

public class IsPalindrome {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text to check is that palindrome: ");
        String text = input.nextLine();

        // Create object
        PalindromeChecker palindrome = new PalindromeChecker(text);

        // Calling method for checking the palindrome
        palindrome.isPalindrome(text);
    }
}