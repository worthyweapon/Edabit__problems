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
// TO KNOW : 
	/* When we try to divide a smaller number using bigger no, if we keep the variables
	 * as int type it will return 0, because it'll not consider the no's after '.'
	 * Either need to change both the variables to double else need to type case while
	 * performing the specific operation
	 */
