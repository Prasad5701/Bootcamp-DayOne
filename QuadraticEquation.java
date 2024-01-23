package Bootcamp;
import java.util.*;
public class QuadraticEquation {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of a : ");
		double a = sc.nextDouble();
		System.out.print("Enter value of b : ");
		double b = sc.nextDouble();
		System.out.print("Enter value of c : ");
		double c = sc.nextDouble();
		
		double delta = b*b - 4*a*c;
		double sqrt = Math.sqrt(delta);		
		double r = 2*a;
		
		if(delta>0) {
			double root1 = (-b + sqrt)/(r);
			double root2 = (-b - sqrt)/(r);
		
			System.out.println("Root 1 : "+ root1);
			System.out.println("Root 2 : "+ root2);
		}
		else if(delta==0)
		{
			System.out.println("The roots of the quadratic equation are real and equal.");
            double root=(-b)/r;
            System.out.println("Root is "+root);
		}
		else 
		{
			System.out.println("The roots of the quadratic equation are complex and different");
            System.out.println("Roots are ");
            System.out.println((-b/r)+" +i" + delta);
            System.out.println((-b/r)+" -i" + delta);
		}
	}

}
