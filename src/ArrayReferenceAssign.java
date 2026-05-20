import java.util.Arrays;

public class ArrayReferenceAssign {
	public static void main(String[] args) {
		String[] a = { "A", "B", "C" };
		String[] b = a;

		b[0] = "X";

		System.out.println("a: " + Arrays.toString(a));
		System.out.println("b: " + Arrays.toString(b));
	}
}