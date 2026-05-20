public class UnicodeCompareProblem {
	public static void main(String[] args) {
		String a = "ギガ";
		String b = "ｷﾞｶﾞ";
		String c = "ギガ"; // 濁点が別の文字として含まれる例  
		String d = "㌐";

		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));

		System.out.println("a length = " + a.length());
		System.out.println("c length = " + c.length());
	}
}