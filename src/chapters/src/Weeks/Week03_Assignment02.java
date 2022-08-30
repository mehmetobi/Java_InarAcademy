package Weeks;

import java.util.Scanner;

public class Week03_Assignment02 {
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);

		System.out.println(" Bir A sayisi giriniz");
		int sayiA = klavye.nextInt();

		System.out.println(" Bir B sayisi giriniz");
		int sayiB = klavye.nextInt();

		System.out.println(" Bir C sayisi giriniz");
		int sayiC = klavye.nextInt();
		int oldest = 0;
		int youngest = 0;

		if (sayiA >= sayiB) {
			oldest = sayiA;
			youngest = sayiB;
		} else {
			oldest = sayiB;
			youngest = sayiA;
		}
		if (sayiC > oldest) {
			oldest = sayiC;
		} else if (sayiC <= youngest) {
			youngest = sayiC;
		}
		System.out.println("En kücük sayi:" + youngest + " En büyük sayi:" + oldest);
	}
}