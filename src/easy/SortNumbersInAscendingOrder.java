package easy;

import java.util.Arrays;

public class SortNumbersInAscendingOrder {

	public static void main(String[] args) 
	{
		int[] a= {80, 29, 4, -95, -24, 85};
		
		Arrays.sort(a);
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

}
