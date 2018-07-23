public class Exam {
	
	public static void main(String[] args){
		
		int k = 3 ;
		int [][] a ;
		a = new int[3][];
		
		for (int r = 0; r < 3 ; r++){
			
			a[r] = new int[k];
			k-- ;
		}
		for (int r = 0; r < 3 ; r++) {
			
			for (int c = 0; c < 3 ; c++){
				
				System.out.print(" " + a[r][c]);
			}
			System.out.println("");
		}
	}
}
