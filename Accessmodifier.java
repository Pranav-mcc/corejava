package java_demo;

public class Accessmodifier {

	private void getName()
	{
	System.out.println("Pranav");
	}
	protected void getGender()
	{
		System.out.println("Male");
	}
	public void getAge()
	{
		System.out.println("22");
	}
	void getDegree()
	{
		System.out.println("bsc");
	}
	public static void main(String[] args) {
		// TODO Auto-generated ;method stub
		Accessmodifier am=new Accessmodifier();
		am.getName();
		am.getGender();
		am.getAge();
		am.getDegree();	

	}

}
