package veryeasy;

public class InchestoFeet {

	public static void main(String[] args) 
	{
		InchestoFeet.inches(327);
	}
	
	public static int inches(int inch)
	{
		int feet = inch/12;
		if(feet>0)
		{
		System.out.println(feet);
		return feet;
		}
		else
			return 0;
	}

}

/*
Create a function that accepts a measurement value in inches and returns the equivalent of the measurement value in feet.
If inches are under 12, return 0.
12 inches = 1 foot.
*/