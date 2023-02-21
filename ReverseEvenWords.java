package week3.day1;

public class ReverseEvenWords
{
		public static void main(String[] args)
		{

		String text = "My Daughter is so cute";
		String[] ReverseEvenWords = text.split(" ");
	   for (int i = 0; i < ReverseEvenWords.length; i++) 
	   {
		    if (i % 2 != 0) 
		    {
		        char[] chars = ReverseEvenWords[i].toCharArray();
		        for (int j = chars.length - 1; j >= 0; j--)
		        {
		            System.out.print(chars[j]);
		        }
		        System.out.print(" ");
		    }
		    else 
		    {
		        System.out.print(ReverseEvenWords[i] + " ");
		    }
	   }
		
		}}
