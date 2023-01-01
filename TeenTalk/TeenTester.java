import java.util.Scanner;

public class TeenTester
{
    public static void main(String[] args)
    {
        // Create a new Teen object and print it out; see the Teen class file
        // to see how the constructor and toString method work.
        Teen myFriend = new Teen("Sonequa", "Martin-Green", 10, true);
        System.out.println(myFriend.toString());
        
        Scanner input = new Scanner(System.in); //New scanner
        String text = input.nextLine(); //Request user input
        
        String output = myFriend.teenTalk(text); //Method that process the statement
        System.out.println(output);
    }
}