package Chapter_05;

public class Exercises05_Soru18_Pattern_B {
	public static void main(String[] args) {
		System.out.println("Pattern B");
		for (int r = 6; r >= 1; r--) {
			for (int c = 1; c <= r; c++) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
}
