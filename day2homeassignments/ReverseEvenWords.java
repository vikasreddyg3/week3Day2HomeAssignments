package week3.day2homeassignments;

public class ReverseEvenWords {

	public static void main(String[] args) 
	{
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
		/* Pseudo Code:
		 * Declare the input as Follow
	      		String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		d)split the words and have it in an array
		e)print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).

		 */
		//Declare the input as Follow
		String test="I am a software tester";
		String revs= "";
		String[] wordSplit;

		//a) split the words and have it in an array
		String[] arr=test.split(" ");
		

		//To print an arr elements
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		//b) Traverse through each word (using loop)
		for(int i=0;i<arr.length;i++)
		{
			//c) find the odd index within the loop (use mod operator)
			if(i%2==1)
			{
				//d)split the words and have it in an array
				wordSplit=arr[i].split("");
				//e)print the even position words in reverse order using another loop (nested loop)
				for(int j=wordSplit.length-1;j>=0;j--)
				{
					revs=revs+wordSplit[j];


				}
			}
			else
			{
				revs=revs+" "+arr[i]+" ";
			}

			System.out.println(revs);

		}




	}
}

