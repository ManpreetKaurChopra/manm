package ArrayList;

public class TestJava {

	public static void main(String[] args) {
	new TestJava();
    TestJava.displayName();
		
		
		boolean status =addition(10,20);
		
		   if ( status == true)
		   {
			   
			System.out.println("the result is true "   );
			   
		   } else {
			   
			   System.out.println("the result is true");
			   
		   }
		
		
		

	}
	
	
	public static boolean addition(int a , int b){
		boolean flag ;
		
		int result;
		result = a+b;
		
		
		if (result == 30){
		flag= true;
	}
		else {
			flag = false;
		}

		  return flag;
	
	}
	
	  public static void displayName()
	  
	  {
		  System.out.println("Manpreet");
	  }
	
	
	
}