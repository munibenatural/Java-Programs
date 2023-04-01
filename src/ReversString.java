
public class ReversString {
	
	public static void main(String args[])
	{
		String sentence="My name is manikyam raju";
		char[] line=sentence.toCharArray();
		for(int i=line.length-1;i>=0;i--)
		{
			System.out.print(sentence.charAt(i));
		}
		
	}

}
