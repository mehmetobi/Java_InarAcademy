package Chapter_02;

import java.util.Scanner;

public class Exercises02_Soru13 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        System.out.print("Enter the monthly saving amount:  ");  
        double money = sc.nextDouble();
        double moneytemp = money;
        money = money * (1 + 0.00417) ;
        money = (money + moneytemp) * (1 + 0.00417) ;
        money = (money + moneytemp) * (1 + 0.00417) ;
        money = (money + moneytemp) * (1 + 0.00417) ;
        money = (money + moneytemp) * (1 + 0.00417) ;
        money = (money + moneytemp) * (1 + 0.00417) ;
        System.out.print("After the sixth month, the account value is : " + money );
	}

}
