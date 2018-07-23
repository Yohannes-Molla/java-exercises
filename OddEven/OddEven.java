// Title : Parity Identifier
// Developed By : John-Fire

import java.util.Scanner ;

public class OddEven {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number ;
		int mod ;
		
		System.out.print("Enter the number: ");
		number = input.nextInt();
		
		mod = number % 2 ;
		
		if ( mod == 0 ) {
			
			System.out.printf("%d%s\n", number, " is Even. ");	
		}else {
			
			System.out.printf("%d%s\n", number," is Odd.");
		}
		
		
	}
}