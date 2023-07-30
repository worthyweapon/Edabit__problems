package veryeasy;

import java.util.Scanner;

public class MultipleOf100 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a=sc.nextInt();
		
		boolean c = a%100==0;
		System.out.println(c);	
	}
	

}
