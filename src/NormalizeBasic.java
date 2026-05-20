import java.text.Normalizer;
import java.text.Normalizer.Form;

public class NormalizeBasic {
	public static void main(String[] args) {
		Form[] forms = { Form.NFD, Form.NFC, Form.NFKD, Form.NFKC };
		String[] words = { "ギガ", "ｷﾞｶﾞ", "ギガ", "㌐" };

		for (Form form : forms) {
			System.out.println("■ " + form);
			for (String word : words) {
				System.out.println(word + " => " + Normalizer.normalize(word, form));
			}
			System.out.println();
		}
	}
}