
public class Swap {

	public static void main(String[] args) {
		
		int x=10,y=20;
		int temp;
		System.out.println("Before swapping"+x+" "+y);
		/*temp=x;
		x=y;
		y=temp;*/
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping"+x+" "+y);

	}

}
