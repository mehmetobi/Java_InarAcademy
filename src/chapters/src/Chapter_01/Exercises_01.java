package Chapter_01;

import java.util.Scanner;

public class Exercises_01 {

	  public static void main(String[] args) {
		    Scanner veri_oku = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter name");
		    String name = veri_oku.next(); 
		    System.out.println("Enter surname");
		    String surname = veri_oku.next(); 
		    System.out.println("Enter age:");
		    int age = veri_oku.nextInt(); 
		    System.out.println("what is your favorite team ? :");
		    String team = veri_oku.next(); 
		    
		    
		    System.out.println("Name: " + name); 
		    System.out.println("Surname: " + surname);
		    System.out.println("Age: " + age);  
		    System.out.println("Team: " + team); 
		    
	 }
}
