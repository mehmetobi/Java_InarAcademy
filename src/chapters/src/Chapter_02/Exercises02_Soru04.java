package Chapter_02;

import java.util.Scanner;

public class Exercises02_Soru04 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number in pounds:  ");  
        double pound = sc.nextDouble();
        double kilo = pound * 0.454; 
        System.out.print(pound + " pound is " + kilo +  " kilograms ");
		
		
	}

}
