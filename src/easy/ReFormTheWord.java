package easy;

public class ReFormTheWord {

	public static void main(String[] args) 
	{
		String a="seas";
		String b= "onal";
		String c = a.substring(0,1).toUpperCase()+a.substring(1);
			/*
			 * a.substring(0,1) = s
			 * a.substring(0,1).toUpperCase() = S
			 * a.substring(1) = eas
			 * a.substring(0,1).toUpperCase()+a.substring(1) = Seas
			 */
		System.out.println(c+b);
	}

}
