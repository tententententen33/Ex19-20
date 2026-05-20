public class ScoreRoundDemo {
	public static void main(String[] args) {
		double average = 79.5;

		System.out.println("元の平均点: " + average);
		System.out.println("四捨五入: " + Math.round(average));
		System.out.println("切り上げ: " + Math.ceil(average));
		System.out.println("切り捨て: " + Math.floor(average));

		if (Math.round(average) >= 80) {
			System.out.println("表示上は合格です");
		} else {
			System.out.println("表示上は不合格です");
		}
	}
}