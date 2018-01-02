package Conditional;

import java.util.Scanner;

public class GreatestOfThree {
	
	public static void main(String args[]) {
		
		int num1;
		int num2;
		int num3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Three Numbers to compare: ");
		
		System.out.println("Enter First Number: ");
		num1 = sc.nextInt();
		
		System.out.println("Enter Second Number: ");
		num2 = sc.nextInt();
		
		System.out.println("Enter Three Number: ");
		num3 = sc.nextInt();
		
		if((num1 > num2 && num1 != num2) && (num1 > num3 && num1 != num3)) {
			
			System.out.println(num1+ " is The Greatest Number.");	
		}
		else if((num2 > num1 && num2 != num1) && (num2 > num3 && num2 != num3)) {
			
			System.out.println(num2+" is The Greatest Number.");
			
		}
		else if((num3 > num1 && num3 != num1) && (num3 > num2 && num3 != num2)) {
			
			System.out.println(num3+ " is The Greatest Number.");
			
		}
		else if(num1 == num2) {
			
			if(num3 > num1)
			System.out.println(num3+ " is the Greatest Number.");
			
			else if(num3 != num1)
				System.out.println(num1+" is the Greatest Number.");
			
			else
				System.out.println("All The Numbers are Equal");	
		}
		else if(num2 == num3) {
			
			if(num1 > num2) 
			System.out.println(num1+ " is the Greatest Number.");
			
			else if(num1 != num2)
				System.out.println(num2+" is the Greatest Number.");
			
			else
				System.out.println("All The Numbers are Equal.");
			
		}	
		else if(num3 == num1) {
			
			if(num2 > num3) 
			System.out.println(num2+ " is the Greatest Number.");
			
			else if(num2 != num3)
				System.out.println(num3+" is the Greatest Number.");
			
			else
				System.out.println("All The Numbers are Equal.");
			
		}
		
		
		sc.close();
		
	}

}
