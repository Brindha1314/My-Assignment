package week3.day1.org.student;

import week3.day1.Computer;
import week3.day1.Desktop;
import week3.day1.org.department.Department;

public class Student extends Department
{
	public void studentName(char c)
	{
		System.out.println("Student Name is:" + "Brindha ");
	}
	public void studentDept(String a)
	{
		System.out.println("Student Dept is: " +"CSE ");
	}
	
	public void studentId(int a)
	{
		System.out.println("Student Id is:" +"4005");
	}
	public static void main(String[] args)
	{
		Student st = new Student();
		st.collegeName('c');
		st.collegeCode('a');
		st.collegeRank('a');
		st.deptName('c');
		st.studentName('c');
		st.studentDept("a");
		st.studentId('a');
			
		
	}
}
