package example14;
import java.util.Scanner;
/*   
    Author: Chan In Kou
    Purpose: The Display will show squence of three numbers.
*/
public class Example14 
{ 
    public static void main(String[] args) 
	{
		//Create a Scanner
		Scanner in = new Scanner(System.in);
		
		//asks the user to enter a sequence of three integers
		System.out.print("Enter a sequence of three integers: ");
		
		//Declare variables
		double x = in.nextDouble();
		double y = in.nextDouble();
		double z = in.nextDouble();
		String output;
		
		//if the sequence is "strictly increasing", "increasing", "strictly decreasing", "decreasing", or "no order"
		
		if (x < y && y < z) 
		{
			output = "strictly increasing";
		}
		else if (x == y && y < z) 
		{
			output = "increasing";
		} 
		else if (x > y && y > z) 
		{
			output = "strictly decreasing";
		}
		else if (x > y && y == z) 
		{
			output = "decreasing";
		}
		else 
		{
			output = "no order";
		}
		
		//Display the results
		System.out.println("Output: " + output);
	} 
}