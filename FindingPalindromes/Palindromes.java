import java.util.Scanner;
public class Palindromes
{
    /**
     * declares scanner and asks for word
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your word");
        String palindrome = input.nextLine();
        
        isPalindrome(palindrome);
        
    }
    
    /**
     * Compares the two strings to decide if they are the same or not
     */
    public static boolean isPalindrome(String text)
    {
        String result = reverse(text);
        
        if (text.equals(result)) {
            System.out.println("Your word is a palindrome!");
            return true;
        } else {
            System.out.println("Not a palindrome :(");
            return false;
        }
    }
    
    /**
     * This method reverses a String.
     * uses string builder to reverse the string and then returns it
     */
    public static String reverse(String text)
    {
        StringBuilder stringBuilder = new StringBuilder(text);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}