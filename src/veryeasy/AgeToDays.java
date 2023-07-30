package veryeasy;

public class AgeToDays {

	public static void main(String[] args) {
		AgeToDays age = new AgeToDays();
		age.calcAge(20);
	}
	
	public static int calcAge(int age) 
	{
		System.out.println(age*365);
		return age*365;
	}

}
