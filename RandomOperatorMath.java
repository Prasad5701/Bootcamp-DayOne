package Bootcamp;
import java.util.Scanner;
public class RandomOperatorMath {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double num1 = Math.floor(Math.random()*10)% 10;
		double num2 = Math.floor(Math.random()*10)% 10;
		double result;
		
		System.out.println(num1);
		System.out.println(num2);
		
		
		double operator1 = Math.floor(Math.random()*10) % 5;
		int operator = (int)operator1;
		switch(operator)
		{
		case 1:
			result = num1+num2;
			System.out.println("Addition is : " + result);
			break;
		case 2:
			result = num1-num2;
			System.out.println("Substraction is : " + result);
			break;
		case 3:
			result = num1*num2;
			System.out.println("Multiplication is : " + result );
			break;
		case 4:
			result = num1/num2;
			System.out.println("Division is : " + result);
			break;
		case 5:
			result = num1%num2;
			System.out.println("Modulus is : " + result );
			break;
		default : 
			System.out.println("Wrong ");
			break;
			
		}
		
		


	}

}
