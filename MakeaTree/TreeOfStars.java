public class TreeOfStars
{
    public static void main(String[] args)
    {
       // Call makeATree 
       makeATree();
    }
    public static void makeATree()
    { 
        //int tiers = 9;
        
        //int base = (tiers * 2) + 1;
        
        int spacing = 9; 
        for (int i = 1; i <= 9; i++)
            {
                
                
                for (int j = 1; j < i; j++)
                {
                    System.out.print(" ");
                }
                
                for (int k = 0; k < spacing; k++)
                {
                    System.out.print("* ");
                }

                System.out.println();
                spacing--;
        }   
    }
}