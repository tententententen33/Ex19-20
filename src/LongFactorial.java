
public class LongFactorial {
	public static void main(String[] args) {
		long result = 1;
		
		for(int i = 1; i <= 25; i++) {
			result *= i;
			System.out.println(result);
		}
	}
}
