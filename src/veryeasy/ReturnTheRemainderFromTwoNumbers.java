package veryeasy;

public class ReturnTheRemainderFromTwoNumbers {

	public static void main(String[] args) 
	{
		ReturnTheRemainderFromTwoNumbers reminder = new ReturnTheRemainderFromTwoNumbers();
		reminder.remainder(-9, 45);
	}
	public static int remainder(int a, int b) 
	{
		System.out.println(a%b);
		return a%b;
	}

}
