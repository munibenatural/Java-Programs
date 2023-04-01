
public class WhileDemo {

	public static void main(String[] args) {
		
		
		int num=100;
		do
		{
			System.out.println(num);
			num++;
			if(num==105)
			{
				continue;
			}
		}while(num<=110);

	}

}
