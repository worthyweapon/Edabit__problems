package easy;

import java.util.Arrays;
import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int A = sc.nextInt();
		
		if (A%3==0 && A%5==0)
		{
			System.out.println("FizzBuzz");
		}
		else if(A%5==0)
		{
			System.out.println("Buzz");
		}
		else if(A%3==0)
		{
			System.out.println("Fizz");
		}
		else
		{
			System.out.println(A);
		}
	}

	
}
