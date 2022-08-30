package Weeks;

import java.util.Scanner;

public class Week_03_Assignment01 {
public static void main (String [] args) {
	Scanner klavye = new Scanner (System.in);
	
	System.out.println("Maasizi giriniz");
	double maas = klavye.nextDouble();
	
	System.out.println("Calistiğiniz toplam yili giriniz ");
	double yil = klavye.nextDouble();
	
	double sonuc;
	if ( yil >= 5 ){
	sonuc = maas * 5 / 100;
	System.out.println( "Net bonus miktari : " + sonuc );
	}else { 
	 sonuc = 0.0 ;
	}
	
}

}
