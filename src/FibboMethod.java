
public class FibboMethod {
	
	static int n1=0,n2=1,n3=0,count;
	
	static void printFibo(int count)
	{
		count=count;
		
		
			for(count=1;count<10;count++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(" "+n3);
			break;
			}
			
			
			
			
		}
	
	

	public static void main(String[] args) {
	
		System.out.println(n1+" "+n2);
		printFibo(count);

	}

}
