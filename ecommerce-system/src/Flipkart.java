import com.xworkz.ecommerceapp.ecommerce.*;

public class Flipkart extends Ecommerce {
  public static void main(String[] args) {
	Flipkart ref = new Flipkart();
	ref.toBuy(2000);
	System.out.println("the dress price is" + ref.price);
	
	Flipkart ref1 = new Flipkart();
	ref1.toBuy(500);
	System.out.println("the price gifting is" + ref1.price);
	
	ref.toPresentGift(500.00, ref1);
	System.out.println("the dress price is" + ref.price);
	System.out.println("the price gifting is" + ref1.price);

}
}
