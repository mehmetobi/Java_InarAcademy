package Chapter_03;
import java.util.concurrent.ThreadLocalRandom;
public class Exercises03_Soru04 {
	
		
	public static void main(String args[]) {
        solution();
    }
    public static void solution(){
        int randomNum = ThreadLocalRandom.current().nextInt(1, 12);
        if (randomNum == 1){
            System.out.println("January");
        }else if (randomNum == 2){
            System.out.println("February");
        }else if (randomNum == 3){
            System.out.println("March");
        }else if (randomNum == 4){
            System.out.println("April");
        }else if (randomNum == 5){
            System.out.println("May");
        }else if (randomNum == 6){
            System.out.println("June");
        }else if (randomNum == 7){
            System.out.println("July");
        }else if (randomNum == 8){
            System.out.println("August");
        }else if (randomNum == 9){
            System.out.println("September");
        }else if (randomNum == 10){
            System.out.println("October");
        }else if (randomNum == 11){
            System.out.println("December");
        }else{
            System.out.println("November");
        }
    
    }
		
		
	

}
