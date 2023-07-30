package veryeasy;

public class MaximumEdgeOfTriangle {

	public static void main(String[] args) 
	{
		MaximumEdgeOfTriangle Tri = new MaximumEdgeOfTriangle();
		Tri.edge(9, 2);
	}
	
	public static int edge(int s1, int s2)
	{
		int edge = (s1+s2)-1;
		System.out.println(edge);
		return edge;
	}

}
