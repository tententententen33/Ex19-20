import java.util.Arrays;

public class ArrayDeep {
	public static void main(String[] args) {
		StringBuilder[] list1 = {
				new StringBuilder("ドレミファソ"),
				new StringBuilder("CDEFG"),
				new StringBuilder("ハニホヘト")
		};

		StringBuilder[] list2 = new StringBuilder[list1.length];
		for (int i = 0; i < list1.length; i++) {
			list2[i] = new StringBuilder(list1[i].toString());
		}

		list1[2].append("イロハ");

		System.out.println("list1: " + Arrays.toString(list1));
		System.out.println("list2: " + Arrays.toString(list2));
	}
}