// Title : Grade Book
// Developed By : John-fire

public class GradeBook {
	
	private String courseName ;
	
	public void setCourseName(String name) {
		
		courseName = name ;
	}
	
	public String getCourseName() {
		
		return courseName ;
	}
	
	public void dispCourseName() {
		
		System.out.printf("Welcome to grade book for \n%s\n ", getCourseName());
	}
	
}