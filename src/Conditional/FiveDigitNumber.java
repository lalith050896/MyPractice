package Conditional;

import java.util.Scanner;

public class FiveDigitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A five Digit Number: ");
		num = sc.nextInt();
		
		if(num > 9999 && num < 100000)
			System.out.println("Given Number " +num+ " is a Five Digit Number.");
		else
			System.out.println("Given Number " +num+ " is NOT a Five Digit Number.");
		
		sc.close();
			
	}

}
