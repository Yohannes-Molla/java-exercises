// Title : Grade Book
// Developed By : John-fire

import java.util.Scanner ;

public class GradeBookTest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		GradeBook myGradeBook = new GradeBook() ;
		
		System.out.printf("Initial Course Name: %s\n\n ",myGradeBook.getCourseName()) ;
		
		System.out.println("Please Enter Your Course Name : ");
		String theName = input.nextLine();
		myGradeBook.setCourseName(theName);
		
		System.out.println();
		
		myGradeBook.dispCourseName();
	}
}