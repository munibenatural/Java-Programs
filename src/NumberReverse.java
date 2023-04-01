
public class NumberReverse {

	public static void main(String[] args) {
		
		int numb=1234,reverse=0;
		while(numb!=0)
		{
			int remainder=numb%10;
			reverse=reverse*10+remainder;
			numb=numb/10;
			
			
			
		}
		System.out.println("Reverse of a number is: "+reverse);
		

	}

}
