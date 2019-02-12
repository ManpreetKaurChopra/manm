package ArrayList;

public class Statis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		addition();
		
		Statis stre = new Statis();
		double a =stre.maddition(10,10.5,10);
		
		
		
		System.out.println(a);
		
		
	}
		

		public static void addition(){
			
			
			int a = 10;
			int b=10;
			int result ;
			
			result = a+b;
			System.out.println(result);
			
			
		}
		
public  double maddition(int a , double b , int c){
			
			double result ;
			
			result = a+b+c;
			return result;
			
			
		}
		
	
}
		
		
