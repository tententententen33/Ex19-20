import java.util.Random;

public class RandomSeedDemo {
	public static void main(String[] args) {
		Random random = new Random(100);

		for (int i = 0; i < 5; i++) {
			System.out.println(random.nextInt(10));
		}
	}
}