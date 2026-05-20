import java.text.NumberFormat;

public class NumberFormatDigits {
	public static void main(String[] args) {
		double average = 82.666666;
		double rate = 0.8567;

		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(2);
		number.setMinimumFractionDigits(1);

		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMaximumFractionDigits(1);

		System.out.println("平均点: " + number.format(average));
		System.out.println("達成率: " + percent.format(rate));
	}
}