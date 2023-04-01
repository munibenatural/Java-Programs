import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysEx {
	
	public static void main(String args[])
	{
		int[] list= {10,23,423,5454,3432};
		/*for(int i=0;i<list.length;i++)
		{
			System.out.print(list[i]);
		}*/
		for(int i=0;i<list.length;i++)
		{
			if(list[i]%2==0)
			{
				System.out.println(list[i]);
				break;
			}
			else
			{
				System.out.println(list[i]+" Is not devesible by 2");
			}
		}
		for(int n:list)
		{
			System.out.println(n);
		}
		
		
		ArrayList<String> alist=new ArrayList<String>();
		
		alist.add("Ram");
		alist.add("Seetha");
		alist.add("Seethavsram");
		alist.add("Seetha ram");
		for(int i=0;i<alist.size();i++)
		{
			
			System.out.println(alist.get(i));
			
		}
		System.out.println(alist.contains("Seetha"));
		
		List<int[]> list1=Arrays.asList(list);
		System.out.println(list1.contains("10"));
		
	}

}
