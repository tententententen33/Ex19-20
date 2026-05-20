import java.util.Random;

public class RandomDice {
	public static void main(String[] args) {
		Random random = new Random();

		int dice = random.nextInt(6) + 1;
		System.out.println("サイコロの目: " + dice);
	}
}