package veryeasy;

public class IsSeven {

	public static void main(String[] args) 
	{
		IsSeven chck = new IsSeven();
		chck.check(7);
	}
	
	public static boolean check(int n)
	{
		boolean ifseven = n==7;
		System.out.println(ifseven);
		return ifseven;
	}

}
