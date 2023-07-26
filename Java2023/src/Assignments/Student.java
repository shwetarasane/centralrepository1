package Assignments;

public class Student {
	
	int course_id=1234;
	String course_name="Selenium Java automation";
	
	
	public void display()
	{
		
		System.out.println("Welcome to you all in DThubinstitute");
	}
	
	public void display1()
	{
		System.out.println("You have enrolled for the course ID  :" +course_id );
		System.out.println("You have enrolled for the course name  :" +course_name );
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student();
		s.display();
		s.display1();
		System.out.println("course_id :" +s.course_id);
		System.out.println("course_name :" +s.course_name);
		
		

	}

}
