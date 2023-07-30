package veryeasy;

public class NameGreeting {

	public static void main(String[] args) 
	{
		NameGreeting.greet("Aaran");
	}

	public static String greet(String name)
	{
		String Greeting = "Hello "+name;
		
		System.out.println(Greeting);
		return Greeting;
	}
}
