package easy;

public class FindTheDiscount {

	public static void main(String[] args) 
	{
		FindTheDiscount disc = new FindTheDiscount();
		disc.discount(89, 20);
		 
	}
	
	public double discount(int price, int discount)
	{
	double Find_Percentage = (double)discount/100*price;
	System.out.println(Find_Percentage);
	
	double discounted_price = price - Find_Percentage;
	System.out.println(discounted_price);
	return discounted_price;
	}
}
