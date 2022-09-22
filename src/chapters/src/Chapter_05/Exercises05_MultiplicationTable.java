package Chapter_05;

public class Exercises05_MultiplicationTable {
	public static void main(String[] args) {
		System.out.println("		Carpim Tablosu");
		System.out.print("    ");
		int yatay = 1;

		for (; yatay <= 9; yatay++) {
			System.out.print("  " + yatay);
		}
		System.out.println("\n——————————————————————————————————————————————");
		for (int dikey = 1; dikey <= 9; dikey++) {
			System.out.print(dikey + " | ");
			for (int carpim = 1; carpim < 10; carpim++) {
				System.out.printf("%3d", carpim * dikey);

			}
System.out.println();
		}

	}
}
