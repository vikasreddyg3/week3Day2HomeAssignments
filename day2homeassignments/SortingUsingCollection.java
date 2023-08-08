package week3.day2homeassignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) 
	{
		/*Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		
		 *get the length of the array		
		 *sort the array
		 *Iterate it in the reverse order
		* print the array
		*Required Output: Wipro, HCL , CTS, Aspire Systems
		*/
		
		String[] companyNames= {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		int length=companyNames.length;
		
		//Adding Array elements to the List
		List<String> cNames=new ArrayList<String>();
		for(int i=0;i<length;i++)
		{
			cNames.add(companyNames[i]);
		}
		
		//Lengt of an Arrauu
		System.out.println("Length of an Array :"+length);
		//sorting the list elements
		Collections.sort(cNames);
		//print the list elements
		System.out.println(cNames);
		//creating Empety Array
		String[] sortWords=new String[cNames.size()];
		
		//adding list elements to the String empty Array
		for(int i=0;i<cNames.size();i++)
		{
			sortWords[i]=cNames.get(i);
		}
		//print the Array in reverse order
		
		System.out.println("Print the Array Element in reverse order");
	    for(int i=sortWords.length-1;i>=0;i--)
	    {
	    	System.out.println(sortWords[i]);
	    }
		
		

	}

}
