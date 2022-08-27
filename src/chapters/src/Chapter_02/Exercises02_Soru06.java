package Chapter_02;

import java.util.Scanner;

public class Exercises02_Soru06 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000:  ");  
        int num = sc.nextInt();
        int first = num % 10;
        num = num / 10;
        int second = num % 10;
        num = num / 10;
        int third = num % 10;
        int total = first + second + third;
        System.out.print("The sum of the digits is : " + total );	
		
		
	}

}
