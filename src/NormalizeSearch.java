import java.text.Normalizer;

public class NormalizeSearch {
	public static void main(String[] args) {
		String[] database = { "ギガプラン", "メガプラン", "ｷﾞｶﾞ割", "㌐対応" };
		String keyword = "ギガ";

		String normalizedKeyword = Normalizer.normalize(keyword, Normalizer.Form.NFKC);

		for (String item : database) {
			String normalizedItem = Normalizer.normalize(item, Normalizer.Form.NFKC);
			if (normalizedItem.contains(normalizedKeyword)) {
				System.out.println("ヒット: " + item + " -> " + normalizedItem);
			}
		}
	}
}