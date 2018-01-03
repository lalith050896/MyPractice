package Conditional;

import java.util.Scanner;

public class PrimeNumberValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The number to Check Prime Validation: ");
	    number = sc.nextInt();
	    if(number == 0 || number == 1) {
	    	System.out.println(number+" is NOT a prime.");
	    }
	    else if(number < 0) {
	    	System.out.println("Number Cannot Be Negative.");
	    }
	    else if(number == 2) {
	    	System.out.println(number+" is a Prime Number.");
	    }
	    else {
	    	for(int i = 2; i < number ; i++) {
	    		if(number % i == 0) {
	    			System.out.println(number+" is NOT a prime.");
	    			count=1;
	    			break;
	    		}
	    	}
	    	if(count == 0) {
    			System.out.println(number+" is a Prime Number.");
    		}
	    }
	}
}	