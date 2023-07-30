package veryeasy;

public class PerimeterOfRectangle {

	public static void main(String[] args) 
	{
		PerimeterOfRectangle peri = new PerimeterOfRectangle();
		peri.rect(6, 7);
	}
	
	public static int rect(int l, int w) 
	{
		int peri = 2*(l+w);
		System.out.println(peri);
		return peri;
	}

}
