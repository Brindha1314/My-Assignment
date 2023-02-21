package week3.day1;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count;
		String[] words = text.split(" ");
		for (int i = 0; i < words.length; i++) {
		    count = 0;
		    for (int j = i + 1; j < words.length; j++) {
		        if (words[i].equals(words[j])) {
		            count++;
		            if (count > 0) {
		                words[j] = "";
		            }
		        }
		    }
		}
		String result = "";
		for (String word : words) {
		    if (!word.equals("")) {
		        result += word + " ";
		    }
		}
		System.out.println(result.trim());


	}
}
