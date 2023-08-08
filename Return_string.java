package java_demo;

public class Return_string {

	 public void methodOne() {
		 System.out.print("Entered Name Is ");
	        methodTwo("Pranav");
	        
	    }

	    public String methodTwo(String a) {
	        System.out.print(a);
	        return a;
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Return_string rs=new Return_string();
           rs.methodOne();
	}

}
