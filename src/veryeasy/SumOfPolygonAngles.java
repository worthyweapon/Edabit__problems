package veryeasy;

public class SumOfPolygonAngles {

	public static void main(String[] args) 
	{
		SumOfPolygonAngles polyAngles = new SumOfPolygonAngles();
		polyAngles.sumOfAngles(6);
	}
	
	public static int sumOfAngles(int n) 
	{
		System.out.println((n-2)*180);
		return (n-2)*180;
	}

}
