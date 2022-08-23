package Chapter_02;

import java.util.Scanner;

public class My_examples_02 {
	
	public static void main(String[] args) {
	
	  
	Scanner data_read = new Scanner (System.in) ;
	
	System.out.println("uzunkenar");
	int uzunkenar = data_read.nextInt();
	System.out.println("kısakenar");
	int kısakenar = data_read.nextInt();
	int alan = alan_hesabi( uzunkenar, kısakenar ) ;
			
	
	
	System.out.println("Uzun kenarı	"   + uzunkenar + "	kısa kenarı	" + kısakenar + "	olan dikdörtgenin alanı	" + alan + "	dır");
	

		
	}
	
	public static int alan_hesabi(int x, int y ) {
		
	return x * y ;
	
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void getuserinfo() {
		
	    Scanner veri_oku = new Scanner(System.in); 
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
