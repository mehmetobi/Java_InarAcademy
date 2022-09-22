package Chapter_05;

import java.util.Scanner;

public class Exercises05_Nested_Loops {
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		int satir_sayisi = klavye.nextInt();

		System.out.println("Satir sayisi giriniz:");
		for (int satir = 0; satir < satir_sayisi; satir++) {
			for (int bosluk = 0; bosluk < satir_sayisi-(satir + 1); bosluk++) {
				System.out.println(" ");

			}
			for (int yildiz = 0; yildiz < 1 + (satir * 2); yildiz++) {
				System.out.println("*");
			}
			System.out.println(" ");
		}
		
	}
}
