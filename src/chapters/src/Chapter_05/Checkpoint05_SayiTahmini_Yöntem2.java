package Chapter_05;

import java.util.Scanner;

public class Checkpoint05_SayiTahmini_Yöntem2 {
	public static void main(String[] args) {
		int sayi = (int) (Math.random() * 101);

		Scanner klavye = new Scanner(System.in);

		while (true) {
			System.out.println("0 ile 100 arasinda bir sayi giriniz");
			int tahmin = klavye.nextInt();

			if (sayi == tahmin) { 
				System.out.println("Bildiniz");
				System.exit(0);
			} else if (sayi < tahmin) {
				System.out.println("Buyuk bir sayi girdiniz");
			} else {
				System.out.println("Kucuk bir sayi girdiniz");
			}
		}
	}

}
