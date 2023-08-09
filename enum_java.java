package java_demo;

public class enum_java {
     public enum Season{ Summer,Winter,Autumn,Fall }
     
     public void EnumJava()
     {
    	 for(Season s:Season.values())
    	 {
    		 System.out.println(s);
    	 }
    	 System.out.println(Season.values());
    	 System.out.println(Season.valueOf("Winter"));
    	 System.out.println(Season.valueOf("Winter").ordinal());
    	 System.out.println(Season.valueOf("Fall").ordinal());
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     enum_java ej=new enum_java();
     ej.EnumJava();
     
	}

}
