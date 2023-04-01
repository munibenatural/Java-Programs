
public class RankCalculator {
	public static void main(String args[])
	{
		
		int marks=99;
		if(marks<40)
		{
			
			System.out.println("Your failed...Try again");
		}
		else if(marks>=40 && marks<=50)
		{
			System.out.println("C Grade");
		}
		else if(marks>=50 && marks<=60)
		{
			System.out.println("B Grade");
		}
		else if(marks>=60 && marks<=70)
		{
			System.out.println("A Grade");
		}
		else if(marks>=70 && marks<=100)
		{
			System.out.println("A++ Grade");
		}
		else
		{
			System.out.println("Invalid");
		}
		
		
	}

}
