public class NumberTriangle
{
    public static void main(String[] args)
    {
       // Call makeNumberTriangle 
       makeNumberTriangle();
    }
    
    // Makes an upright triangle with the numbers 1-5
    public static void makeNumberTriangle()
    {
        for(int i = 0;i <= 4 ; i++)
        {
            
            // We can manipulate the boolean condition to change each iteration 
            //In this case, each time the outer loop iterates, j < 7 - i decreases by one
            for(int j = 4; j >= 4 - i; j--)
            {
                System.out.print((j * -1) + 5 + " ");
                
            }
            System.out.println(" ");
        } 
    }
}