package week3.day2homeassignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) 
	{
		/*Declare a String as "PayPal India"
          Convert it into a character array
          Declare a Set as charSet for Character
          Declare a Set as dupCharSet for duplicate Character
          Iterate character array and add it into charSet
          if the character is already in the charSet then, add it to the dupCharSet
          Check the dupCharSet elements and remove those in the charSet
          Iterate using charSet
		  Check the iterator variable isn't equals to an empty space
		  print it
		*/
		//Declare a String as "PayPal India"
		String s="Paypal India";
		//Convert it into a character array
		char[] ch=s.toCharArray();
		
		Set<Character> charSet=new LinkedHashSet<Character>();// Declare a Set as charSet for Character
		Set<Character> dupCharSet=new LinkedHashSet<Character>();//Declare a Set as dupCharSet for duplicate Character
		
		// Iterate character array and add it into charSet
       // if the character is already in the charSet then, add it to the dupCharSet
		for(int i=0;i<ch.length;i++)
		{
			
			if(!(charSet.contains(ch[i])))
			{
				charSet.add(ch[i]);
				
			}
			else
			{
				dupCharSet.add(ch[i]);
			}
		}
		System.out.println(charSet);
		System.out.println(dupCharSet);
		
		// Check the dupCharSet elements and remove those in the charSet
		charSet.removeAll(dupCharSet);
		
		for(char c:charSet)
		{
			// Check the iterator variable isn't equals to an empty space
			if(c!=' ')
			{
				// print it
				System.out.println(c);
				
			}
		}
		
		
		
	}

}
