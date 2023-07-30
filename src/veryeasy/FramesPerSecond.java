package veryeasy;

public class FramesPerSecond {

	public static void main(String[] args) 
	{
		FramesPerSecond fps = new FramesPerSecond();
		fps.frames(10, 25);
	}
	void frames(int min, int fps)
	{
		int Frame_per_sec = (min *60)*fps;
		System.out.println(Frame_per_sec);
	}
}
