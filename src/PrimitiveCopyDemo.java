import java.util.Arrays;

public class PrimitiveCopyDemo {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30 };
		int[] b = Arrays.copyOf(a, a.length);

		a[0] = 999;

		System.out.println("a: " + Arrays.toString(a));
		System.out.println("b: " + Arrays.toString(b));
	}
}