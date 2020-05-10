import java.util.*;

class cricket extends Exception
{
public static float runrate(int runs, int overs)
{
    float runrate = runs/overs;
    return runrate;
}


public static void main(String[] args)  

{
    
    Scanner sc = new Scanner(System.in);
    try
    {
        System.out.println("Enter the total runs");
        int runs = sc.nextInt();
        System.out.println("Enter the total overs");
        int overs = sc.nextInt();
        System.out.println("Average run rate"); //runrate = total runs/ total overs
        System.out.println(runrate(runs,overs)+"/per over");
    }
    catch(ArithmeticException ae)
    {
        System.out.println("Please give correct values");
    }
    catch(NumberFormatException ne)
    {
        System.out.println("Please give number format input");
    }
}
}