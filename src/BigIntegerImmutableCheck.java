import java.math.BigInteger;

public class BigIntegerImmutableCheck {
	public static void main(String[] args) {
		BigInteger x = BigInteger.valueOf(10);
		x.add(BigInteger.valueOf(5));
		System.out.println("x = " + x);
		
		BigInteger y = x.add(BigInteger.valueOf(5));
		System.out.println("y = " + y);
	}
}
