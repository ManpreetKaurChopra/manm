package ArrayList;

public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String studentNeed = "Java123";
		
		
		if(studentNeed.equalsIgnoreCase("manual")){
			
			System.out.println("not needed");
			
		} else if (studentNeed.equalsIgnoreCase("manualAutomation")){
			
			System.out.println("action not needed");
			
		}
		
		
		else if (studentNeed.equalsIgnoreCase("Java")){
			
			System.out.println("name matches");
			
			
		}
		else	{
			System.out.println("name no  matches");
	
	}

}
}