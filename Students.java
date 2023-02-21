package week3.day1;

public class Students {
	
	public void getStudentInfo(String StudentId)
	{
		System.out.println("Student Id is:"+ StudentId);
	}
	public void getStudentInfo(String StudentID, String StudentName)
	{
		System.out.println("Student Id is:"+ StudentID + "Student nameis:" + StudentName);
		
	}
	public void getStudentInfo(long mobileno, long regno )
	{
		{
			System.out.println("Student mobile No is: " + mobileno + "Student RegNo : " + regno );
	}
	}
	
public static void main(String[] args)
{
	Students obj = new Students();
	obj.getStudentInfo("is00142");
	obj.getStudentInfo("is00142", "Brindha");
	obj.getStudentInfo( 9787654564l , 567398764532l);
}
}
