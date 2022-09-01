package Chapter_03;

import java.util.Random;

public class Exercises03_Soru16 {

	public static void main(String[] args) {
		
		
		Random rand = new Random();

		int x = rand.nextInt(100) - 50;
		int y = rand.nextInt(200) - 100;
		
		System.out.println("" + x + " " + y);
		
		System.out.println("The rectangle coordinates are (" + x + "," + y + ")");
	}
}
