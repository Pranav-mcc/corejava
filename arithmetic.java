package java_demo;

public class arithmetic {

	public void Addition(int a,int b)
	{
		System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
	}
	public void Substraction()
	{
		int a=20;int b=10;
		System.out.println("Substraction of "+a+" and "+b+" is "+ (a-b));
	}
	public int Multiply(int a,int b)
	{
		System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
	   return a*b;
	}
	public float Division()
	{
		 float a=20;float b=3;
		 System.out.println("Division of "+a+" and "+b+" is "+(a/b));
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arithmetic calc=new arithmetic();
		calc.Addition(10, 20);
		calc.Substraction();
		calc.Multiply(10, 20);
		calc.Division();
		
	}
}
