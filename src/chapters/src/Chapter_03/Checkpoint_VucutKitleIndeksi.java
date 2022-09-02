package Chapter_03;

import java.util.Scanner;

public class Checkpoint_VucutKitleIndeksi {
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);

		System.out.println("Agırlıgı kg cinsinden giriniz: ");
		double agirlik = klavye.nextDouble();

		System.out.println("Boyunuzu metre cinsinden yazınız: ");
		double boy = klavye.nextDouble();

		double kitleindeksi = agirlik / (boy * boy);

		System.out.println(" Vücut kitle indeksi: " + kitleindeksi + "dir");

		if (kitleindeksi < 18.5) {

			System.out.println("Çok zayıf");
		} else if (kitleindeksi < 25) {
			System.out.println("Normal");
		} else if (kitleindeksi < 30) {
			System.out.println("Kilolu");
		} else {
			System.out.println("Obez");
		}

	}
}
