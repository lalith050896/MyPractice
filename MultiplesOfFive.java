package Conditional;

import java.util.Scanner;

public class MultiplesOfFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number of Terms: ");
		number = sc.nextInt();
		
		for(int i = 1; i <= number; i++) {
				System.out.print("5 X "+(i)+" = "+(5*i));
			    System.out.println("");
		}
		

	}

}
