package week3.day2homeassignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args)
	{
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		Set<Integer> emptySet=new TreeSet<Integer>();
		
		for(int i=0;i<data.length-1;i++)
		{
			emptySet.add(data[i]);
		}
		System.out.println("Set of values :"+emptySet);
		
		int setSize=emptySet.size();
		
		System.out.println("Size of the set :"+setSize);
		
		List<Integer> setValues=new ArrayList<Integer>(emptySet);
		System.out.println("List of Values :"+setValues);
		System.out.println("Second Largest Number from The Set :"+setValues.get(setValues.size()-2));
		
		

	}

}
