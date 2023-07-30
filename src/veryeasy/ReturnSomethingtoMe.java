package veryeasy;

public class ReturnSomethingtoMe {

	public static void main(String[] args) {
		ReturnSomethingtoMe something = new ReturnSomethingtoMe();
		something.giveMeSomething("Bob Jane");

	}
	
	public static String giveMeSomething(String a)
	{
		String something_added = "Something " + a;
		System.out.println(something_added);
		return something_added;
	}

}
