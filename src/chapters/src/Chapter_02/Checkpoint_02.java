package Chapter_02;

import java.util.Scanner;

public class Checkpoint_02 {

	 public static void main (String [] args ) {
/*
		 System.out.println(" Saniye cinsinden bir tam sayı giriniz: ");	 
		   Scanner klavye = new Scanner(System.in);
	
		   int saniye = klavye.nextInt();
		   int dakika = saniye / 60;
		   int kalanSaniye = saniye % 60;
		   
		   System.out.println(saniye  + " saniye "  + dakika + " dakika ve " +  kalanSaniye +  " saniyedir " );
	  */
   //--------------------------------------------------------------
		   
		   double x = 2 ;
		   double y = 3 ;
		double islem = üs_alma (x, y ) ;
 
		System.out.println(islem );
// ---------------------------------------------------------
		System.out.println( 3 > 5 );
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter purchase amount: ");
		double purchaseAmount = input.nextDouble();
		double tax = purchaseAmount * 0.06;
		System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);
		
		
	double a = 1; 
	double b = 1;
    double c = 1;
    double d = 1;
    double e = 1;
    
   
	double sonuc = ((3 + 4 * a ) / 5 ) - ((10 * (b - 5) * (c + d + e)) / a + 9 * 4 / a + (9 + a) / b  ) ;
	 

	System.out.println(sonuc);
	 }
// ---------------------------------------------------------------------------
	
	
	
		
		
			 
	 
public static double üs_alma(double x , double y ) {
	
	return Math.pow (x,y);
	// ---------------------------------------------------------------------
}
	 
 


	 
	 
	 
}
