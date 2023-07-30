package veryeasy;

import java.util.Scanner;

public class BuggyCode 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name :");
		String name = sc.next();
		
		
//		switch(name)
//		{
//		case "Matt" :
//			System.out.println("Hello " +name);
//			break;
//
//		case "Mubashir" :
//			System.out.println("Hello, my Love!");
//			break;
//		
//		case "Helen" :
//			System.out.println("Hello " +name);	
//			break;
//		}
		
		if(name =="Mubashir")
		{
			System.out.println("Hello, my Love!");
		}
		else
			System.out.println("Hello " +name);	
	}
}
