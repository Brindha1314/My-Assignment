package week1.day2;

public class Fibbinocci {

	public static void main(String[] args) {
		int num1=0,num2=1,num3=0;
		System.out.println("Fibonacci Series");
		System.out.println(num1);
		for(int i=1;i<13;i++)
		{
			num1 = num2;
			num2= num3;
			num3=num1+num2;
			System.out.println(num3);
		
	}

}
}
