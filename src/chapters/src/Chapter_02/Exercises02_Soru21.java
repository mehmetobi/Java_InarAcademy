package Chapter_02;

import java.util.Scanner;

public class Exercises02_Soru21 {
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
        System.out.print("Enter investment amount: "); 
        double amount = sc.nextDouble();
        System.out.print("Enter annual interest rate in percentage: "); 
        double rate = sc.nextDouble();
        System.out.print("Enter number of years: "); 
        double year = sc.nextDouble();
       double result = amount * Math.pow( 1 + rate, year*12);

        System.out.println("Accumulated value is " + result);
		
		
	}

}
