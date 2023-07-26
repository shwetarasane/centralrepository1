package Assignments;

public class Constructors {
	
	public Constructors()
	
	{
		this(22,45,33);
		System.out.println("This is default constructor");
	}
	
	public Constructors(int a)
	
	{
		this(12,22,23,44);
	System.out.println("This is one parametrized constructor");
}
	
public Constructors(int a, int b)
	
	{
	this();
	System.out.println("This is two parametrized constructor");
}

public Constructors(int a, int b, int c)

{

System.out.println("This is three parametrized constructor");

}

public Constructors(int a, int b, int c,int d)

{
	this(61,20);
	
System.out.println("This is four parametrized constructor");

}


	public static void main(String[] args) {
		
		Constructors c=new Constructors(12);

	}

}
