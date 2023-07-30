package veryeasy;

public class IntegerDivisibleBy5 {

	public static void main(String[] args) 
	{
		IntegerDivisibleBy5.div(70);
	}
	
	public static boolean div(int n)
	{
		boolean res = n%5==0;
			System.out.println(res);
			return res;
			
	}

}
