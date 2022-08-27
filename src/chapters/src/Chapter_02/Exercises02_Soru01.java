package Chapter_02;

import java.util.Scanner;

public class Exercises02_Soru01 {

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.print("Enter a degree in Celsius: ");  
        double celcius = sc.nextDouble();
        double fahrenheit = (9.0 / 5.0) * celcius + 32;
        System.out.print( celcius + " Celsius is " +  fahrenheit + " Fahrenheit"); 
    }
	
}
