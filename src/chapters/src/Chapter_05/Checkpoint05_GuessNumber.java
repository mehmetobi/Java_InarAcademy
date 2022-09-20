package Chapter_05;

import java.util.Scanner;

public class Checkpoint05_GuessNumber {
	public static void main(String[] args) {

		int sayi = (int)(Math.random() * 101);
	
		Scanner klavye = new Scanner(System.in);
		System.out.println(" 0 ile 100 arasinda bir sayi giriniz ");
		int tahmin = -1 ;

		while (tahmin != sayi) {
			System.out.print(" Bir tahmin giriniz ");
			tahmin = klavye.nextInt();
			if (tahmin == sayi) {
				System.out.println(" Tebrikler bildiniz ");
			} else if (tahmin > sayi) {
				System.out.println(" Tahmininiz çok yüksek ");
			} else {
				System.out.println(" Tahmininiz çok düsük ");
			}

		}
	}
}