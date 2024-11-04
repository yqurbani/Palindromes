import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        while (true) {
            System.out.print("Enter a string to check if it's a palindrome or type 'q' to quit: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            boolean result = checker.isPalindrome(input);
            if(result){
                System.out.println("The string is a palindrome.");
            }else{
                System.out.println("The string is not a palindrome.");
            }
        }
        scanner.close();
    }
}