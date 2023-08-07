package easy;

import java.util.Arrays;

public class The3ProgrammersProblem {

	public static void main(String[] args) 
	{
		int A =147;
		int B = 33;
		int C = 526;
		
		int temp = (A<B)?A:B;
		int Lowest = (C<temp)?C:temp;
		//System.out.println(Lowest);
		
		int temp1 = (A>B)?A:B;
		int Largest = (C>temp1)?C:temp1;
		//System.out.println(Largest);
		
		int DB_Highest_vs_Lowest = Largest - Lowest;
		System.out.println(DB_Highest_vs_Lowest);
	}

}
