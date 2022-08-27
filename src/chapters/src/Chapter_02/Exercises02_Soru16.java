package Chapter_02;

import java.util.Scanner;

public class Exercises02_Soru16 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        System.out.print("Enter the side:  ");  
        double s = sc.nextDouble();
       double result = ((3 * Math.pow(3, 0.5 )) /  2 ) * Math.pow(s,2);

        System.out.print("The area of the hexagon is : : " + result );
		
	}

}
