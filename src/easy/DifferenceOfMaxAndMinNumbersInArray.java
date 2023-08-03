package easy;

import java.util.Arrays;

public class DifferenceOfMaxAndMinNumbersInArray {

	public static void main(String[] args) 
	{
		int a[] = {10, 4, 1, 4, -10, -50, 32, 21};
	
		//Sorting the array and finding the difference using index
		Arrays.sort(a);
		System.out.println(a[0] - a[a.length-1]);
	}
	
	
}
