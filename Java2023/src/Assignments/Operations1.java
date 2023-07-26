package Assignments;

public class Operations1 {

	
	public int div(int a, int b)
	
	{		int c=a/b;
		return c;
					
	}	
	public int sub(int a, int b)
	{
		int c=a-b;
		return c;
			}
	
	
		
		public int add(int a, int b)
		
		{		
			int c=a+b;
			return c;
						}
		
		
		public int mult(int a, int b)
		
		{
			int c=a*b;
			return c;
			
				}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Operations1 expression=new Operations1();
			
			int divresult=expression.div(10,2);
			int subresult=expression.sub(divresult,2);
			int addresult=expression.add(subresult,2);
			int subresult1=expression.sub(addresult,2);
			int multresult=expression.mult(subresult1, 2);
			
			
			System.out.println("Result of the operation(((((10/2)-2)+2)-2)*2) is " + multresult);
			
			
		}

	}


	


