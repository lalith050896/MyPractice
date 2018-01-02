package Conditional;

import java.util.Scanner;

public class TaxDeduction {
	static double salary;
	static double hra;
	static double pf;
	static double taxable_income;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Monthly Salary: ");
		salary = sc.nextDouble();
		
		System.out.println("Enter HRA: ");
		hra = sc.nextDouble();
		
		System.out.println("Enter PF: ");
		pf = sc.nextDouble();
		
		taxable_income = salary - hra - pf;
		
		if(taxable_income >= 0 && taxable_income <= 500000)
			System.out.println("Total Tax to be Paid By the Employee is: " +Tax(10)); 
		
		else if(taxable_income >= 500000 && taxable_income <= 1000000)
				System.out.println("Total Tax to be Paid By the Employee is: " +Tax(20));

		else if(taxable_income >= 1000000)
			System.out.println("Total Tax to be Paid By the Employee is: " +Tax(30));	
		sc.close();
	}

	private static double Tax(int i) {
		// TODO Auto-generated method stub
		taxable_income = (taxable_income*i)/100;
		return taxable_income;
	}

}
