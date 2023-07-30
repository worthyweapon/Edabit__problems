package easy;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operation : ");
		String operator = sc.next();
		BasicCalculator cal = new BasicCalculator();
		cal.calc(20, 10, operator);
		

	}
	
	public void calc(int n1, int n2, String operator)
	{
		switch (operator)
		{
		case "+" :
			System.out.println("Addition : " + (n1+n2));
			break;
			
		case "-" :
			System.out.println("Subtraction : " + (n1-n2));
			break;
			
		case "*" :
			System.out.println("Multiplication : " + (n1*n2));
			break;
			
		case "%" :
			System.out.println("Remider : " + (n1%n2));
			break;
			
		case "/" :
			System.out.println("Division : " + (n1/n2));
			break;
				
		}
		
	}

}
