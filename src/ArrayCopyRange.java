import java.util.Arrays;

public class ArrayCopyRange {
	public static void main(String[] args) {
		String[] kana = { "あ", "い", "う", "え", "お" };

		String[] part1 = Arrays.copyOfRange(kana, 1, 4);
		String[] part2 = Arrays.copyOfRange(kana, 2, 7);

		System.out.println("元の配列: " + Arrays.toString(kana));
		System.out.println("1 から 4 未満: " + Arrays.toString(part1));
		System.out.println("2 から 7 未満: " + Arrays.toString(part2));
	}
}