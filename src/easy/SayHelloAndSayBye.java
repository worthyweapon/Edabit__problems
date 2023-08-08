package easy;

public class SayHelloAndSayBye {

	public static void main(String[] args) 
	{
		SayHelloAndSayBye call = new SayHelloAndSayBye();
		String s = call.sayHelloBye("Alok", 1);
		System.out.println(s);
	}
	
	public String sayHelloBye(String name, int n)
	{
		if(n==1)
		{
			return "Hello "+name;
		}
		else if(n==0)
		{
			return "Bye "+name;
		}
		return name;
	}

}
