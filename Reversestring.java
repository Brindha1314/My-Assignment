package week3.day1;

public class Reversestring 
{
	public static void main(String[] args)
	{
		String str = "Subraja";
		char[] charArray = str.toCharArray();
		System.out.println("Convert String to charArray:"+ charArray[1]);
		for(int i =charArray.length-1;i>=0;i--)
			System.out.println(charArray[i]);
		System.out.println("reverse of String");
		
	}
	

}
