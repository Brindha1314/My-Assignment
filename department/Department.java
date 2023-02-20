package week3.day1.org.department;

import week3.day1.org.college.College;

public class Department extends College
{

	public void deptName(char c)
	{
		System.out.println("Department is:" +"CSE");
	}
	public static void main(String[] args)
	{
		Department dp= new Department();
		dp.collegeName('c');
		dp.collegeCode('a');
		dp.collegeRank('a');
		dp.deptName('c');
		
		
	}
}
