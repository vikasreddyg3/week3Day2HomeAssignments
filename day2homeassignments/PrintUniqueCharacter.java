package week3.day2homeassignments;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		
		//PrintUniqueCharacter
		/*
		 * Problem
		 * a) Take your name as input
		 * b) Print all unique characters only (any order)
		 * Input:  babu
		 * Output: a u 
		 */

		/*
		 * Psuedocode
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 */
		
		String name="Vikas Reddy";
		
		char[] ch=name.toCharArray();
		System.out.println(ch);
		Set<Character> uniqech=new LinkedHashSet<Character>();
		Set<Character> dupCh=new LinkedHashSet<Character>();
		for(int i=0;i<ch.length;i++)
		{
			boolean add=uniqech.add(ch[i]);
			if(!add)
			{
				dupCh.add(ch[i]);
			}
		}
		
		System.out.println(uniqech);
		System.out.println(dupCh);
		
		
		
		
		
		
		

	}

}
