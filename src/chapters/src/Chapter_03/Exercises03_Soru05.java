package Chapter_03;

import java.util.Scanner;

public class Exercises03_Soru05 {
	
	public static void main(String args[]) {
        solution();
    }
    public static String find_day(int today){
        
        int day_number = today % 7;
        
        if (day_number == 0){
            return "Sunday";
        }else if (day_number == 1){
            return "Monday";
        }else if (day_number == 2){
            return "Tuesday";
        }else if (day_number == 3){
            return "Wednesday";
        }else if (day_number == 4){
            return "Thursday";
        }else if (day_number == 5){
            return "Friday";
        }else{
            return "Saturday";
        }
    }
    
    public static void solution(){
        
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter today's day:");
        
        int today = sc.nextInt();  
    
        String today_string = find_day(today);

        System.out.print("Enter the number of days elapsed since today:");
    
        int futureDay = sc.nextInt();  
    
        String futureDay_string = find_day(today + futureDay);
        
        System.out.println("Today is " + today_string + " and the future day is " + futureDay_string);
    
    }
	
	
    }

