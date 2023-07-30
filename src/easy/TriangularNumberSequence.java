package easy;

public class TriangularNumberSequence {

	public static void main(String[] args) 
	{
		TriangularNumberSequence TriNo = new TriangularNumberSequence();
		TriNo.TriNoSeq(215);
	}

	public void TriNoSeq(int n)
	{
		int T = n*(n+1)/2;
		System.out.println(T);
	}
}
