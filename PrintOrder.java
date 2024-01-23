package Bootcamp;
import java.util.Scanner;

public class PrintOrder {
	public static void main(String []args)
	{
		Scanner cs = new Scanner(System.in);
		System.out.print("Enter a ID : ");
		int id = cs.nextInt();
		System.out.print("Enter a Item Name : ");
		String name = cs.next();
		System.out.print("Enter a Quantity : ");
		int quantity = cs.nextInt();
		System.out.print("Enter a Cost Of Item : ");
		int price = cs.nextInt();
		
		System.out.print("Order" + id + " "+ quantity + " of " + name  + " for  a total of Rs " + price + ".");
	}

}
