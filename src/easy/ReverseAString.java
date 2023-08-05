package easy;

public class ReverseAString {

	public static void main(String[] args) 
	{
		String a="Hello World";
		
		char[] b= a.toCharArray();
		
		for(int i=b.length-1; i>=0; i--)
			//Total length of a =11, index=10
			System.out.print(b[i]);
	}

}
