package Chapter_02;

import java.util.Scanner;

public class Exercises02_Soru03 {
 
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
        System.out.print("Enter a value for feet: ");  
        double feet = sc.nextDouble();
        double meter = feet * 0.305;
        System.out.print(feet + " feet is " + meter +  " meters ");
		
	}

}
