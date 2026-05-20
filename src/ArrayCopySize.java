import java.util.Arrays;

public class ArrayCopySize {
	public static void main(String[] args) {
		String[] names = { "佐藤", "鈴木", "高橋" };
		System.out.println("元の配列: " + Arrays.toString(names));

		String[] bigger = Arrays.copyOf(names, 5);
		System.out.println("拡張後  : " + Arrays.toString(bigger));

		bigger[3] = "田中";
		bigger[4] = "伊藤";
		System.out.println("追加後  : " + Arrays.toString(bigger));

		String[] smaller = Arrays.copyOf(names, 2);
		System.out.println("縮小後  : " + Arrays.toString(smaller));
	}
}