// title = Array
// by = John-fire

import java.util.Scanner ;

public class Array {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int arraySize ;
		
		System.out.println("Enter the Size of the Array: ");
		arraySize = input.nextInt();
		
		int[] array = new int[arraySize];
		
		System.out.printf("%s%d%s","Enter",arraySize,"numbers");
		for (int i = 0;i < arraySize;i++){
			
			System.out.println("");
			array[i] = input.nextInt(); 
			
		}
		for (int i = 0;i < arraySize;i++){
			
			System.out.println(array[i]);
		}
		
	}
}