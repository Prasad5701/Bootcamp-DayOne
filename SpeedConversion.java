package Bootcamp;
import java.util.Scanner;
public class SpeedConversion {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("conversion : 1.KilometerPerHour to MeterPerSec ");
		System.out.println("             2.MeterPErSec to KilometerPerHour");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1 :
			System.out.println("Convert KiloMeter Per Hour to Meter Per Second ");
			System.out.print("Enter Kilo Per Hour : ");
			double kmPerHr =sc.nextDouble(); 
			double meterPerSec = kmPerHr*1000/3600;
			System.out.println("Meter Per Second "+ meterPerSec);
			
			break;
		case 2 :
			System.out.println("Meter Per Second to Convert KiloMeter Per Hour");
			System.out.print("Enter Meter Per Second : ");
			double meterPerSec1 =sc.nextDouble(); 
			double kmPerHr1 = meterPerSec1*3600/1000;
			System.out.println("Meter Per Second "+ kmPerHr1);
			break;
		default: 
			System.out.println("Please Enter Right Choice");
		
		}
	}

}
