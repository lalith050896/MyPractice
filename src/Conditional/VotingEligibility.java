package Conditional;

import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Age of a Person: ");
		age = sc.nextInt();
		
		if(age >= 18) 
			
			System.out.println("Person is Eligible to Cast Vote.");
	
		else if (age <= 0)
			System.out.println("Age Cannot be Zero or Negative Number. Please Try again ");
			
		else
			System.out.println("Person is NOT Eligible to Cast Vote.");
		
		sc.close();
	}

}
