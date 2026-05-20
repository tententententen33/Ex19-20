import java.math.BigInteger;

public class BigIntegerFactorial {
	public static void main(String[] args) {
		BigInteger result = BigInteger.ONE;
		for(int i = 1; i <= 25; i++) {
			result = result.multiply(BigInteger.valueOf(i));
			System.out.println(i + "! = " + result);
		}
	}
}
