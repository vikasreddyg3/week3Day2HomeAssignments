package week3.day2homeassignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) 
	{
		/*
		 * Pseudo code 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";
		 *Output= We learn java basics as part of sessions in week1
		 * Psuedocode
		 * b) Split the String based on white spaces and save as String Array ,Then iterate the Array	  
		 * c) Create a empty Set 
		 * d) Iterate the String array
	                 d.1) add each word into Set
		 * e) Print the Set values which is having unique words
		 */
		
		
		// a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1 basics in we";
	
	// * b) Split the String based on white spaces and save as String Array ,Then iterate the Array	  
	
	
	String[] splitWords=text.split(" ");
	
	int size=splitWords.length;
	System.out.println("count of words in String :"+size);
	
	Set<String> uniquewords= new LinkedHashSet<String>();
	Set<String> duplicateWords=new LinkedHashSet<String>();
	
	
	for(int i=0;i<size-1;i++)
	{
		boolean add=uniquewords.add(splitWords[i]);
		if(!add)
		{
			duplicateWords.add(splitWords[i]);
		}
	}
	
	System.out.println(uniquewords);
	System.out.println(duplicateWords);
	
	
	
	
		
	}

}
