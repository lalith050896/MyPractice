package Conditional;

import java.util.Scanner;

public class PriceDiscount {
	static double price;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Price Of a Product: ");
		price = sc.nextDouble();
		
		if(price <= 10000 && price > 0) {
			
			System.out.println(" Selling Price After Discount is: " +Sp(10));
		}
		else if(price > 10000 && price <= 20000 ) {
			
			System.out.println(" Selling Price After Discount is: " +Sp(20));
			
		}
		else if(price > 20000) {
			
			System.out.println(" Selling Price After Discount is: " +Sp(25));
			
		}
		else if(price <= 0) {
			
			System.out.println("Bill Amount Can't be Negative or Zero.");
			
		}
		
		sc.close();
		
	}
	private static double Sp(int i) {
		double discount;
		double selling_price;
		
		discount = (price*i)/100;
		selling_price = price - discount;
		
		return selling_price;	
	}
 
}
