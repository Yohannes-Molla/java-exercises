// Title : Grade Book test
// Developed By : John-fire

import java.util.Scanner ;

public class GradeBookTest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		GradeBook myGradeBook = new GradeBook() ;
		
		System.out.println("Please Enter your Course Name: ");
		String nameOfCourse = input.nextLine();
		
		System.out.println();
		
		myGradeBook.displayMassege(nameOfCourse) ;
	}
}