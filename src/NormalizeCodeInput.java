import java.text.Normalizer;

public class NormalizeCodeInput {
	public static void main(String[] args) {
		String input1 = "ＡＢＣ１２３";
		String input2 = "ABC123";

		System.out.println(input1.equals(input2));

		String n1 = Normalizer.normalize(input1, Normalizer.Form.NFKC);
		String n2 = Normalizer.normalize(input2, Normalizer.Form.NFKC);

		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n1.equals(n2));
	}
}