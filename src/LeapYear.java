import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		System.out.println("Enter the Year: ");
		Scanner in=new Scanner(System.in);
		int year=in.nextInt();
		
		if(((year%4==0)&&(year%100!=0))||(year%400==0))
		{
			System.out.println("Entered year is leap year");
		}
		else
		{
			System.out.println("Its not a leap year");
		}

		
	}

}
