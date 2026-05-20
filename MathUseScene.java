
public class MathUseScene {
	public static void main(String[] args) {
		int scoreA = 82;
		int scoreB = 97;
		int scoreC = 64;
		
		int max = Math.max(scoreA, Math.max(scoreB, scoreC));
		int min = Math.min(scoreA, Math.min(scoreB, scoreC));
		double average = (scoreA + scoreB + scoreC)/3.0;
		
		System.out.println("最高点: " + max);
		System.out.println("最低点: " + min);
		System.out.println("平均点: " + average);
		System.out.println("平均点(四捨五入): " + Math.round(average));
	}
}
