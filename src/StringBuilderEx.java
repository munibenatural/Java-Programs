
public class StringBuilderEx {
	
	public static void main(String args[])
	{
		String str="Manikyam";
		StringBuilder str1=new StringBuilder();
		str1.append(str);
		str1=str1.reverse();
		System.out.println("After reversing a string::"+str1);
		
	}

}
