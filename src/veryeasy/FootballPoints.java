package veryeasy;

public class FootballPoints {

	public static void main(String[] args) 
	{
		FootballPoints.points(3, 4, 2);
	}
	
	public static int points(int wins, int draws, int losses)
	{
		int points_calc = wins*3+draws*1+losses*0;
		
		System.out.println(points_calc);
		return points_calc;
		
	}

}


/*
 Create a function that takes the number of wins, draws and losses and calculates the number of points a football team has obtained 
so far.

	wins get 3 points
	draws get 1 point
	losses get 0 points
*/