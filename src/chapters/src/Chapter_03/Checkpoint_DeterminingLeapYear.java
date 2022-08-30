package Chapter_03;

import java.util.Scanner;

public class Checkpoint_DeterminingLeapYear {
	public static void main (String [] args ) {
	Scanner klavye = new Scanner (System.in) ;
	
	System.out.println("Bir yil giriniz");
	int yil = klavye.nextInt();
	
	
	boolean artikYilmi = yil % 4 == 0 ;
	
	artikYilmi = artikYilmi && yil % 100 != 0 ;
	
	artikYilmi = artikYilmi || yil % 400 == 0 ;
	
	
	if (artikYilmi) {
		System.out.println(yil + "artik yildir");
	}else {
			System.out.println(yil + "artik yil degildir");
			
		}
		
	}
}
