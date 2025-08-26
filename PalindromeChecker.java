import java.util.Scanner;

public class PalindromeChecker {
     public static boolean isPalindrome(String str) {
    // Base case: an empty string or a string with one character is a palindrome
    if (str.length() <= 1) {
      return true;
    }
    char firstChar = str.charAt(0);
    char lastChar = str.charAt(str.length() - 1);

    if (firstChar != lastChar) {
      return false;
    }

    String remainingSubstring = str.substring(1, str.length() - 1);
    return isPalindrome(remainingSubstring);
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the the string");
    String input=sc.nextLine();
    System.out.println(input + " is a palindrome: " + isPalindrome(input));
  } 
}
