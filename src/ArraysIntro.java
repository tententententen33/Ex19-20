import java.util.Arrays;

public class ArraysIntro {
	public static void main(String[] args) {
		String[] animals = {"dog", "cat", "mouse", "fox", "lion"};
		
		System.out.println("配列そのもの:" + animals);
		System.out.println("中身の表示:" + Arrays.toString(animals));
		
		Arrays.sort(animals);
		System.out.println("ソート後:" + Arrays.toString(animals));
		
		int index = Arrays.binarySearch(animals, "mouse");
		System.out.println("mouseの位置:" + index);
	}
}
