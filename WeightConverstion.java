package Bootcamp;

import java.util.Scanner;

public class WeightConverstion {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter weight in pound : ");
		double pound = sc.nextDouble();
		
		
		double kg = (pound*453.592)/1000 ;
		System.out.println("Converted Pound into kg : " + kg);
	}

}
