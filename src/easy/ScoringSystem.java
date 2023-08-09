package easy;

public class ScoringSystem {

	public static void main(String[] args) 
	{
		String a = "ABCBAC";
		int count_A = 0;
		int count_B = 0;
		int count_C = 0;
		
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='A')
			{
				count_A++;
			}
			else if(a.charAt(i)=='B')
			{
				count_B++;
			}
			else if(a.charAt(i)=='C')
			{
				count_C++;
			}
		}
System.out.println(count_A);
System.out.println(count_B);
System.out.println(count_C);
	}

}
