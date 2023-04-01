import java.util.Scanner;

public class Ifelse {
	
	public static void main(String args[])
	{
		
		System.out.println("Enter your age:");
		Scanner in=new Scanner(System.in);
		int age=in.nextInt();
		if(age>18)
		{
			System.out.println("You are eligible to play game");
		}
		else
		{
			System.out.println("You are age should be more than 18");
		}
		
		
		
		
	}

}
