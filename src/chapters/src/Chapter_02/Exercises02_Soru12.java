package Chapter_02;

import java.util.Scanner;

public class Exercises02_Soru12 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");  
        double v = sc.nextDouble();
        double a = sc.nextDouble();
        
        double result = (v * v) / (2 * a) ;
        
        System.out.print("The minimum runway length for this airplane is : " + result );
		
	}

}
