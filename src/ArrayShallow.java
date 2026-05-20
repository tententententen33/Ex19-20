import java.util.Arrays;

public class ArrayShallow {
	public static void main(String[] args) {
		StringBuilder[] list1 = {
				new StringBuilder("ドレミファソ"),
				new StringBuilder("CDEFG"),
				new StringBuilder("ハニホヘト")
		};

		StringBuilder[] list2 = Arrays.copyOf(list1, list1.length);

		list1[2].append("イロハ");

		System.out.println("list1: " + Arrays.toString(list1));
		System.out.println("list2: " + Arrays.toString(list2));
	}
}