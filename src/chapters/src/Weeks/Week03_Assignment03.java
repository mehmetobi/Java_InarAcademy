package Weeks;

import java.util.Scanner;

public class Week03_Assignment03 {
public static void main (String [] args ) {
	
	Scanner input = new Scanner (System.in);
	System.out.println("Enter a number of four digits: eg. 2547 ");
	
	int number = input.nextInt();
	
	int a = number % 10;
	
	int remaining = number / 10;
	
	int b = remaining % 10;
	
	int remaining2 = remaining / 10;
	
	int c = remaining2 % 10;
	
	int d = remaining2 / 10;

	number = 1000*d + 100*c + 10*b + a;
	if (a == 0 && b== 0 && c==0) {
		
		System.out.print("000" + d);
		}else if (a == 0 && b== 0) {
		
		System.out.print("00" + (10*c + d));
		}else if (a == 0) {
			
		System.out.print("0"+(100*b + 10*c + d));
			} else {
		System.out.println(1000*a + 100*b + 10*c + d);
			}
	
	
}
	
	
	
}
