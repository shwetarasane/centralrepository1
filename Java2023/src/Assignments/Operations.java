package Assignments;

public class Operations {
	
	public int add(int a, int b)
	
	{		
		int c=a+b;
		return c;
					}
	
	public int sub(int a, int b)
	{
		int c=a-b;
		return c;
			}
	
	public int mult(int a, int b)
	
	{
		int c=a*b;
		return c;
		
			}
	public int div(int a, int b)
	
	{		int c=a/b;
		return c;
					
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations expression=new Operations();
		
		int sumresult=expression.add(10,2);
		int sumresult1=expression.add(sumresult,2);
		int subresult=expression.sub(sumresult1,2);
		int multresult=expression.mult(subresult,2);
		int divresult=expression.div(multresult,2);
		
		System.out.println("Result of the operation(((((10+2)+2)-2)*2)/2) is " +divresult);
		
		
	}

}
