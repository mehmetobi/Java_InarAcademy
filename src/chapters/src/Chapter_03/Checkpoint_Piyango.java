package Chapter_03;

import java.util.Scanner;

public class Checkpoint_Piyango {
	public static void main(String[] args) {

		int piyango = (int) (Math.random() * 90) + 10;

		Scanner klavye = new Scanner(System.in);
		System.out.println("Piyango icin iki basamakli bir sayi tahmin ediniz:");
		int tahmin = klavye.nextInt();

		int piyangoBirlerBasamagi = piyango % 10;
		int piyangoOnlarBasamagi = piyango / 10;

		int tahminBirlerBasamagi = tahmin % 10;
		int tahminOnlarBasamagi = tahmin / 10;

		System.out.println("Piyango numarası: " + piyango);

		if (piyango == tahmin) {
			System.out.println("Tebrikler bildiniz. 1000 TL kazandiniz");
		}else if (piyangoBirlerBasamagi == tahminOnlarBasamagi 
				&& piyangoOnlarBasamagi == tahminBirlerBasamagi) {
			System.out.println("İki rakami da tutturdunuz. 3000 TL kazandiniz.");
			}else if (piyangoBirlerBasamagi == tahminBirlerBasamagi 
				
			
				|| piyangoBirlerBasamagi == tahminOnlarBasamagi
				|| piyangoOnlarBasamagi == tahminBirlerBasamagi
				|| piyangoOnlarBasamagi == tahminOnlarBasamagi) {
			System.out.println("Bir rakam tutturdunuz. 1000 TL kazandiniz.");
		} else {
			System.out.println("Bilemediniz :(");
		}

	}
}
