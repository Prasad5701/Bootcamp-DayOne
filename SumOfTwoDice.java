package Bootcamp;
import java.util.Scanner;
public class SumOfTwoDice {
	public static void main(String[]args)
	{
		double num1 = Math.floor(Math.random()*10)% 6;
		double num2 = Math.floor(Math.random()*10)% 6;
		
		double sum = num1 + num2;
		System.out.println("Roll of Dice : "+ sum);
		
		
		
	}
	

}
