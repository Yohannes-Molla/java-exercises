// title = Addition

import java.util.Scanner;

public class Addition {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		
		System.out.print("Enter the 1st number: ");
		number1 = input.nextInt();
		
		System.out.print("Enter the 2nd number: ");
		number2 = input.nextInt();
		
		sum = number1 + number2 ;
		
		System.out.printf("The Sum is %d\n ",sum);
	}
}// End of class Addition