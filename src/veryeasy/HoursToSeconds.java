package veryeasy;

public class HoursToSeconds {

	public static void main(String[] args) {
		
		HoursToSeconds calc = new HoursToSeconds();
		calc.howManySeconds(24);
	}
	
	public static int howManySeconds(int hours) 
	{
		System.out.println(hours*3600);
		return hours*3600;
	 }

}
