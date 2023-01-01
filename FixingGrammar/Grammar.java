import java.util.Scanner;

public class Grammar
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); //New scanner
        System.out.println("Please input sentence"); //Requests users sentence
        String text = input.nextLine(); //Colects user input
        
        useProperGrammar(text); //Calls the "useProperGrammar()" method
    }
    
    public static String useProperGrammar(String theText) //the "useProperGrammar()" method
    {
        
        for(int i = 0; i < theText.length(); i++) // for loop that traverses the string
        {
        	if (theText.substring(i, i + 1).equals("2"))  //tells the computer to run the below command if the string equals "2"
        	{
        	    theText = theText.replace("2", "to"); //Replaces the number "2" with "to"
        	}
        	
        	System.out.println(theText); //prints the new text
            System.out.println("Fixed " + i + " grammatical errors:"); //tells the user how many "2"s were replaced
        }
        
        return theText; //returns the corrected version of the sentence
        
    }
}