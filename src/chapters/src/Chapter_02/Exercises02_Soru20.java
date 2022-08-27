package Chapter_02;

import java.util.Scanner;

public class Exercises02_Soru20 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): "); 
        double balance = sc.nextDouble();
        double rate = sc.nextDouble();
        double resut = balance * (rate / 1200);

        System.out.println("The interest is : " + resut);
	}

}
