// Title = Analysis
// By = John-Fire

import java.util.Scanner ;

public class Analysis {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int pass = 0 ;
		int fail = 0 ;
		int studCounter = 1 ;
		int result = 0 ;
		
		while(studCounter <= 10){
			
			System.out.print("Enter result(1 = pass , 2 = fail) : ");
			result = input.nextInt();
			
			if (result == 1)
				pass = pass + 1 ;
			else
				fail = fail + 1 ;
			
			studCounter = studCounter + 1 ;
		}
		
		System.out.printf("Passed : %d\nFailled : %d\n",pass,fail);
		
		if(pass >= 8)
			System.out.println(" Bonus To Instructor");
	}
}