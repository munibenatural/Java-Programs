
public class PalindromeStrings {

	public static void main(String[] args) {
		
		/*
		 * String original="madam"; String reverse=""; int length=original.length();
		 * for(int i=length-1;i>=0;i--)
		 * 
		 * {
		 * 
		 * reverse=reverse+original.charAt(i); if(original.equals(reverse)) {
		 * System.out.println("Entered string is a palindrome"); } else {
		 * System.out.println("Entered string is not a palindrome"); } //break;
		 * 
		 * }
		 */
		 String str = "Radar", reverseStr = "";
		    
		    int strLength = str.length();

		    for (int i = (strLength - 1); i >=0; --i) {
		      reverseStr = reverseStr + str.charAt(i);
		    }

		    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
		      System.out.println(str + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(str + " is not a Palindrome String.");
		
		

	}
	}
	

}
