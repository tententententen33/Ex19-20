import java.text.NumberFormat;
import java.util.Random;

public class RandomDiscount {
	public static void main(String[] args) {
		Random random = new Random();
		int price = 3000;
		int discountPercent = random.nextInt(31); // 0〜30% 

		double rate = discountPercent / 100.0;
		int discountPrice = (int) Math.round(price * (1 - rate));

		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		System.out.println("元の価格: " + currency.format(price));
		System.out.println("割引率 : " + percent.format(rate));
		System.out.println("割引後 : " + currency.format(discountPrice));
	}
}