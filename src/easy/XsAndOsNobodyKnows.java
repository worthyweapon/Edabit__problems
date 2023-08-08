package easy;

public class XsAndOsNobodyKnows {

	public static void main(String[] args) 
	{
		String a ="xxooo";
		int count_x=0;
		int count_o=0;
		for(int i=0; i<a.length();i++)
		{
			if(a.charAt(i)=='x')
			{
				count_x++;
			}
			else if(a.charAt(i)=='o')
			{
				count_o++;
			}
		}
		if(count_x==count_o)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}

}
