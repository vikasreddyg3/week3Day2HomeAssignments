package week3.day2homeassignments;

public class Palindrome {

	public static void main(String[] args) 
	{
		
		
		//Build a logic to find the given string is palindrome or not
	     
		/*
		 * Pseudo Code
		 * a) Declare A String value as"madam"
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		// a) Declare A String value as"madam"
		String value="maDAm";
		// b) Declare another String rev value as ""
		
		String rev="";
		int len=value.length();
		System.out.println("Length od given String :"+len);
		
		// c) Iterate over the String in reverse order
		for(int i=value.length()-1;i>=0;i--)
		{
			//d) Add the char into rev
			rev=rev+value.charAt(i);
		}
		
		// e) Compare the original String with the reversed String, if it is same then print palinDrome 
		if(rev.equalsIgnoreCase(value))
		{
			System.out.println("given String "+value+" is palindrom");
		}
		else
		{
			System.out.println("given String "+value+" is not palindrom");
		}
		
		

	}

}
