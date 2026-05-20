import java.util.Arrays;

public class BinarySearchCondition {
	public static void main(String[] args) {
		int[] numbers = { 30, 10, 50, 20, 40 };

		System.out.println("ソート前: " + Arrays.toString(numbers));
		System.out.println("ソート前に検索: " + Arrays.binarySearch(numbers, 40));

		Arrays.sort(numbers);
		System.out.println("ソート後: " + Arrays.toString(numbers));
		System.out.println("ソート後に検索: " + Arrays.binarySearch(numbers, 40));
	}
}