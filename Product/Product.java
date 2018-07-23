// Title = Product

import java.util.Scanner ;

public class Product {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		int product;
		
		System.out.print("Enter the 1st Number: ");
		num1 = input.nextInt();
		
		System.out.print("Enter the 2nd Number: ");
		num2 = input.nextInt();
		
		System.out.print("Enter the 3rd Number: ");
		num3 = input.nextInt();
		
		product = num1 * num2 * num3 ;
		
		System.out.printf("%s%d\n","The Product is ",product);
	}
}