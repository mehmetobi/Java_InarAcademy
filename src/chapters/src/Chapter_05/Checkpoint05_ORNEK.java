package Chapter_05;

import java.util.Scanner;

public class Checkpoint05_ORNEK {

	public static void main(String[] args) {
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		Scanner input = new Scanner(System.in);
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();
		int count = 1;
		boolean is_need_loop = true;

		if (number1 + number2 == answer) {
			System.out.println("You got it!");
			is_need_loop = false;

		}

		while (is_need_loop) {
			System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
			answer = input.nextInt();
			if (number1 + number2 == answer) {
				System.out.println("You got it!");
				break;
			} else if (count >= 3) {
				System.out.println("Cevap hakkınız doldu.");
				break;
			}
			count++;
		}

	}
}
