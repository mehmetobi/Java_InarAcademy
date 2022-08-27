package Chapter_02;

import java.util.Scanner;

public class Exercises02_Soru02 {
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");  
        double radius = sc.nextDouble();
        double length = sc.nextDouble();
        double area = radius * radius * 3.14;
        double volume = area * length;
        System.out.print("The area is " +  area + " The volume is " +  volume);
		
		
	}
}
