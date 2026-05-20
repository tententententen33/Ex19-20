import java.util.Random;

public class RandomOmikuji {
	public static void main(String[] args) {
		Random random = new Random();
		String[] fortunes = {"大吉", "中吉", "小吉", "吉", "末吉", "凶", "大狂"};
		
		int index = random.nextInt(fortunes.length);
		System.out.println("今日の運勢: " + fortunes[index]);
	}
}
