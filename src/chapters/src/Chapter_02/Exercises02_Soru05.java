package Chapter_02;

import java.util.Scanner;

public class Exercises02_Soru05 {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate:  ");  
        double num = sc.nextDouble();
        double rate = sc.nextDouble();
        double gratuity = (num / 100) * rate;
        double total = gratuity + num ; 
        System.out.print("The gratuity is " + gratuity + " and total is " + total );
		
		
	}

}
