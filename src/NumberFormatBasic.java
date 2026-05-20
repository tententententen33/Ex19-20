import java.text.NumberFormat;

public class NumberFormatBasic {
	public static void main(String[] args) {
		int price = 1234567;
		double rate = 0.856;
		NumberFormat number = NumberFormat.getInstance();
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();

		System.out.println("通常表示: " + number.format(price));
		System.out.println("通貨表示: " + currency.format(price));
		System.out.println("割合表示: " + percent.format(rate));
	}
}