import java.util.Arrays;

public class ArrayFillDemo {
	public static void main(String[] args) {
		int[] scores = new int[6];
		Arrays.fill(scores, -1);
		System.out.println("初期化後: " + Arrays.toString(scores));

		scores[0] = 80;
		scores[1] = 95;
		scores[2] = 72;
		System.out.println("入力後  : " + Arrays.toString(scores));
		Arrays.fill(scores, 3, 6, 0);
		System.out.println("範囲更新: " + Arrays.toString(scores));
	}
}
