import java.util.Scanner;

public class UserInput 
{
	public static void main(String[] args) 
	{
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//prompt
		System.out.println("Enter an integer:");
		
		//write input
		int n = input.nextInt();
		
		System.out.println("You entered: " + n);
	}
}
