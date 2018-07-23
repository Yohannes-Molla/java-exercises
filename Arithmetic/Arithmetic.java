// Title : Arithmetic Operation Calculator
// Developed By : John-Fire

import java.util.Scanner ; 

public class Arithmetic {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in) ;
		
		int num1 ;
		int num2 ; 
		int sum ;
		int diff ;
		int product ; 
		int qoutient ;
		int mod ; 
		
		System.out.print("Enter the 1st number : ");
		num1 = input.nextInt();
		
		System.out.print("Enter the 2nd number : ");
		num2 = input.nextInt();
		
		sum = num1 + num2 ;
		diff = num1 - num2 ;
		product = num1 * num2 ;
		qoutient = num1 / num2 ;
		mod = num1 % num2 ;
		
		System.out.printf("Their Sum is %d\n",sum);
		System.out.printf("Their Difference is %d\n",diff);
		System.out.printf("Their Product is %d\n",product);
		System.out.printf("Their Quotient is %d\n",qoutient);
		System.out.printf("Their Reminder is %d\n",mod);
		
		
	}
}