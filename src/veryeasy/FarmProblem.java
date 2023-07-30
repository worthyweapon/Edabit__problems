package veryeasy;

public class FarmProblem {

	public static void main(String[] args) 
	{
		FarmProblem leg = new FarmProblem();
		leg.legs(2, 5, 8);
	}
	
	public static int legs(int cow, int chicken, int pig)
	{
		int Total_legs = (cow*4)+(chicken*2)+(pig*4);
		
		System.out.println(Total_legs);
		return Total_legs;
		
	}
}
