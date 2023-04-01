import java.util.HashMap;

public class CountNuofWords {

	public static void main(String[] args) {
		
		String str="Raju Raju Raju is is is a a a smart guy";
		String strr[]=str.split(" ");
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<strr.length;i++)
		{
			if(map.containsKey(strr[i]))
			{
				int count=map.get(strr[i]);
				map.put(strr[i], count+1);
		
			}
			else
			{
				map.put(strr[i], 1);
			}
			System.out.println(map);
		}

	}

}
