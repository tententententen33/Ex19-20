import java.math.BigInteger;

public class BigIntegerCompare {
	public static void main(String[] args) {
		BigInteger a = new BigInteger("12345678901234567890");
		BigInteger b = new BigInteger("9999999999999999999");

		if (a.compareTo(b) > 0) {
			System.out.println("a の方が大きいです");
		} else if (a.compareTo(b) < 0) {
			System.out.println("b の方が大きいです");
		} else {
			System.out.println("同じ値です");
		}
	}
}