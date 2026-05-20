import java.text.NumberFormat;
import java.util.Random;

public class Review19To20 {
	public static void main(String[] args) {
		Random random = new Random(100);

		int score1 = random.nextInt(41) + 60;
		int score2 = random.nextInt(41) + 60;
		int score3 = random.nextInt(41) + 60;

		int total = score1 + score2 + score3;
		double average = total / 3.0;

		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMaximumFractionDigits(1);

		System.out.println("点数 1: " + score1);
		System.out.println("点数 2: " + score2);
		System.out.println("点数 3: " + score3);
		System.out.println("平均点: " + nf.format(average));
	}
}