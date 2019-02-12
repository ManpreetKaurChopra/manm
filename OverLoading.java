package ArrayList;

public class OverLoading {

	public static void main(String[] args) {
	

		
		OverLoading stsics = new OverLoading();
		stsics.addition(1, 3,5);
		
		
		
	}

	
	
	public  void addition(int a ,int b)
	{
		
		int result = a + b;
	System.out.println(result);
		
	}
	
	public void addition(int a ,int b ,int c)
	{
		
		int result = a + b +c;
		System.out.println(result);
		
	}
	
	
}
