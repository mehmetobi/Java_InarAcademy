package Chapter_03;

import java.util.Scanner;

public class Exercises03_Soru01 {
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);

		System.out.println("Bir 'a' sayisi giriniz");
		int a = klavye.nextInt();

		System.out.println("Bir 'b' sayisi giriniz");
		int b = klavye.nextInt();

		System.out.println("Bir 'c' sayisi giriniz");
		int c = klavye.nextInt();

		double x = (b * b) - 4 * a * c;

		if (x == 0.0) {
			double r1 = -b / (2 * a);
			System.out.println("The equation has one root:" + r1);
		} else if (x > 0.0) {
			double r1 = (-b + Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
			double r2 = (-b - Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
			System.out.println("The equation has two roots:" + r1 + "," + r2);
		} else if (x < 0.0) {
			System.out.println("The equation has no roots");
		}

	}

}
