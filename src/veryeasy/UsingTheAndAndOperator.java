package veryeasy;

public class UsingTheAndAndOperator {

	public static void main(String[] args) 
	{
		UsingTheAndAndOperator and = new UsingTheAndAndOperator();
		and.and(false, false);
	}
	
	public boolean and(boolean a,boolean b)
	{
		boolean c = a && b;
		System.out.println(c);
		return c;
	}

}
