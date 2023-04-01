import java.util.Scanner;

public class ReverseStringchar {

	public static void main(String[] args) {
		
		String str;
		System.out.println("Enter the string");
		Scanner in=new Scanner(System.in);
		str=in.nextLine();
		String strr[]=str.split("");
		for(int i=strr.length-1;i>=0;i--)
		{
			System.out.print(strr[i]);
		}
		

	}

}
