package easy;

import java.util.Scanner;

public class StringEndingMatchesSecondString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("String 1 : ");
		String str1 = sc.next();
		
		System.out.print("String 2 : ");
		String str2 = sc.next();
		
//Endswith
		boolean compare = str1.endsWith(str2);
		System.out.println(compare);
	}

}
