package Chapter_02;

import java.util.Scanner;

public class Exercises02_Soru10 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");  
        double m = sc.nextDouble();
        System.out.print("Enter the initial temperature: "); 
        double initial = sc.nextDouble();
        System.out.print("Enter the final temperature: "); 
        double finalTemp = sc.nextDouble();
        double result = m * (finalTemp - initial) * 4184 ;
        
        System.out.print("The energy needed is : " + result );
		
		
		
		
	}

}
