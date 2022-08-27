package Chapter_02;

import java.util.Scanner;

public class Exercises02_Soru14 {
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
	    System.out.print("Enter weight in pounds:  ");  
	    double pound = sc.nextDouble();
	    System.out.print("Enter height in inches:  ");  
	    double inches = sc.nextDouble();
	    double height = inches * 0.0254;
	    double weight = pound * 0.45359237 ; 
	    
	    double bmi =  weight  / ( height * height) ; 
	    System.out.print("BMI is  : " + bmi );
	}	
	}

	

