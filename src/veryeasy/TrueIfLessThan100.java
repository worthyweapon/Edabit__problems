package veryeasy;

public class TrueIfLessThan100 {

	public static void main(String[] args) 
	{
		TrueIfLessThan100 less = new TrueIfLessThan100();
		less.sum(50, 0);
	}
	
	public static boolean sum(int a, int b)
	{
		boolean c = (a+b)<100;
		System.out.println(c);
		return c;
		
	}

}
