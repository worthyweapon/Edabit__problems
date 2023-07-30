package veryeasy;

public class FlipTheBoolean {

	public static void main(String[] args) 
	{
		FlipTheBoolean.reverse(true);
	}
	
	public static boolean reverse(boolean a)
	{
		boolean b = !a;
		System.out.println(b);
		return b;
	}

}
