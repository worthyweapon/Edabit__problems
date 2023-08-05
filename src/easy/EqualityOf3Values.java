package easy;

public class EqualityOf3Values {

	public static void main(String[] args) 
	{
		int a=2;
		int b=0;
		int c=2;
		int count=0;
		if (a == b && b == c) {
            count = 3;
        } else if (a == b || a == c || b == c) {
            count = 2;
        }
		System.out.println(count);
	}

}
