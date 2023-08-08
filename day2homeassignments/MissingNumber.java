package week3.day2homeassignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) 
	{
		/*
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */
	
		int[] ele= {6,7,8,6,1,2,3,7,8,1,2,3,4};
		
		//a) Remove the duplicates using Set
		//b) Make sure the set is in the ascending order
		Set<Integer> uniqueElements=new TreeSet<Integer>();
		for(int i=0;i<ele.length;i++)
		{
			uniqueElements.add(ele[i]);
		}
		System.out.println("Unique set Elements :"+uniqueElements);
		
		List<Integer> setEle=new ArrayList<Integer>(uniqueElements);
		
		int size=setEle.size();
		System.out.println(size);
		//c) Iterate from the starting number and verify the next number is + 1
		//d) If did not match, that is the number
		int index=0;
		for(int i:setEle)
		{
			if((index+1)!=i)
			{
				System.out.println("Missing number in the List :"+(index+1));
				index++;
			}
			index++;
			
		}
		
		
		

	}

}
