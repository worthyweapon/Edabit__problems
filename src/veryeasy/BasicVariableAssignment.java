package veryeasy;

public class BasicVariableAssignment {

	public static void main(String[] args) 
	{
		BasicVariableAssignment concat = new BasicVariableAssignment();
		concat.nameString("Hello");
	}
	
	public static String nameString(String name)
	{
		String eda = "Edabit";
		
		String result = name + eda;
		
		System.out.println(result);
		return result;
		
	}
	

}
