
package Bootcamp;
import java.util.Scanner;
public class ComputeMark {
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Physics Mark : ");
		double pMarks = sc.nextDouble();
		System.out.print("Enter Chemistry Mark : ");
		double cMarks = sc.nextDouble();
		System.out.print("Enter Math Mark : ");
		double mMarks = sc.nextDouble();
		
		double totalPercent = ((pMarks + cMarks +mMarks)/300)*100;
		System.out.println("Total PErcentage is : " + totalPercent);
	}
	
	

}
