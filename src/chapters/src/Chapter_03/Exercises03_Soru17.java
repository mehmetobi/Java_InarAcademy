package Chapter_03;

import java.util.*;

public class Exercises03_Soru17 {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		int generated_number = rand.nextInt(3);
		
		System.out.println("Scissor (0), rock (1), paper (2) and enter number:");
		Scanner input = new Scanner(System.in);
		int user_choose = input.nextInt(); 
		
		// Scissor (0), rock (1), paper (2)
		/*
		 * 0 - 0
		 * 0 - 1
		 * 0 - 2
		 * 1 - 0
		 * 1 - 1
		 * 1 - 2
		 * 2 - 0
		 * 2 - 1
		 * 2 - 2
		 */
		
		if (generated_number == 0 && user_choose == 0) {
			System.out.println("Draw");
		} else if (generated_number == 0 && user_choose == 1) {
			System.out.println("You won!");
		} else if (generated_number == 0 && user_choose == 2) {
			System.out.println("Computer won!");
		} else if (generated_number == 1 && user_choose == 0) {
			System.out.println("Computer won!");
		} else if (generated_number == 1 && user_choose == 1) {
			System.out.println("Draw");
		} else if (generated_number == 1 && user_choose == 2) {
			System.out.println("You won!");
		} else if (generated_number == 2 && user_choose == 0) {
			System.out.println("You won!");
		} else if (generated_number == 2 && user_choose == 1) {
			System.out.println("Computer won!");
		} else if (generated_number == 2 && user_choose == 2) {
			System.out.println("Draw");
		} else {
			System.out.println("Unexpected case !");
		}
	}
	
}
