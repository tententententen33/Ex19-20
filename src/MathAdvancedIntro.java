public class MathAdvancedIntro {
	public static void main(String[] args) {
		double x = 3;
		double y = 4;
		double distance = Math.sqrt(x * x + y * y);
		System.out.println("原点からの距離: " + distance);

		double degree = 90;
		double radian = Math.toRadians(degree);
		System.out.println("90 度の sin: " + Math.sin(radian));
		System.out.println("90 度の cos: " + Math.cos(radian));
	}
}