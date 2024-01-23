package Bootcamp;

import java.util.Scanner;

public class TimeConversion {
		public static void main(String [] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Seconds : ");
			int second = sc.nextInt();
			
			
			int min = second/60;
			int hr = second/(60*60);
			int seconds = second % 60;
			
			System.out.println("Hours : "+hr + " Min : "+ min +" seconds : "+seconds);
			
		
		
		
		
	}

}
