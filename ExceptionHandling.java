package java_demo;

public class ExceptionHandling {

	public void handle()
	{
		try
		{
			int b=2/0;
			System.out.println(b);
		}
		catch(Exception a)
		{
			System.out.println(a);		
	    }
	finally
	{
	  System.out.println("I will work anyway");	
	}
		throw new ArithmeticException();
	}
	public static void main(String[] args) throws ArithmeticException{
		// TODO Auto-generated method stub
		ExceptionHandling eh=new ExceptionHandling();
		eh.handle();
		

	}

}
