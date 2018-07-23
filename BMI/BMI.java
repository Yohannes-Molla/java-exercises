// Title : Body Mass Index Calculator
// Developed By : John Fire

import java.util.Scanner ;

public class BMI {
	
	public static void main(String[] args) {	
	
		System.out.println("   This Program Executes your Body Mass Index  "); 
		System.out.println("==================================================");
		
		Scanner input = new Scanner(System.in);
		
		float weight;
		float height;
		float bmi;
		System.out.print("Enter your weight: ");
		weight = input.nextFloat();
		
		System.out.print("Enter your height: ");
		height = input.nextFloat();
		
		bmi = weight / (height * height);
		
		
		if ( bmi < 18.5 ){
				System.out.printf("Result : Underweight and your BMI is %f\n",bmi);
		}else if ( bmi >= 18.5 && bmi < 25) {
			System.out.printf("Result : Normal and your BMI is %f\n",bmi);
		}else if ( bmi >= 25 && bmi < 30) {
			System.out.printf("Result : Overweight and your BMI is %f\n",bmi);
		}else if ( bmi >= 30) {
			System.out.printf("Result : Obese and your BMI is %f\n",bmi);
		}
	}
}