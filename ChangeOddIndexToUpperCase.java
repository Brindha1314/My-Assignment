package week3.day1;

public class ChangeOddIndexToUpperCase { 
		public static void main(String[] args) {
			String str1 = "changeme";
			char[] ch = str1.toCharArray();

			for( int i = 0; i < str1.length(); i++) {
				if(i % 2 != 0) {
					ch[i] = Character.toUpperCase(ch[i]);

				}
			}
				String result = new String(ch);
				System.out.println(result);

}
}
