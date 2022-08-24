package Chapter_02;

import java.util.Scanner;

public class Checkpoint_02 {

	 public static void main (String [] args ) {

		 System.out.println(" Saniye cinsinden bir tam sayı giriniz: ");	 
		   Scanner klavye = new Scanner(System.in);
	
		   int saniye = klavye.nextInt();
		   int dakika = saniye / 60;
		   int kalanSaniye = saniye % 60;
		   
		   System.out.println(saniye  + " saniye "  + dakika + " dakika ve " +  kalanSaniye +  " saniyedir " );
	  
		   //--------------------------------------------------------------
		   
		   double x = 2 ;
		   double y = 3 ;
		double islem = üs_alma (x, y ) ;
 
		System.out.println(islem );
		
		 
			 }
	 
	 
	
public static double üs_alma(double x , double y ) {
	
	
	return Math.pow (x,y);
	
	
	
}
	 
	 
	 
	 
}
