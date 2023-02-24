package week3.day2;


import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class FirstSecondLargest {
	public static void main(String[] args) {

		// Here is the input
		Integer[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
			SortedSet<Integer> sortedSet = new TreeSet<Integer>(Arrays.asList(data));
		
		        sortedSet.remove(sortedSet.last());
		        int secondLargestNumber = sortedSet.last();
		        
		        System.out.println("Second largest number in an Arrays is - "
		                + secondLargestNumber);

		      
		    }
		
	}