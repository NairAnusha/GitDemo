
public class ExercisePascal {

	public static void main(String[] args) {
		  int rows = 5; // Number of rows for Pascal's triangle
	        
	        for(int i = 0; i < rows; i++) {
	            // Print leading spaces for alignment
	            for(int j = 0; j < rows - i - 1; j++) {
	                System.out.print(" ");
	            }
	            
	            // Calculate and print Pascal's triangle values
	            int value = 1;
	            for(int k = 0; k <= i; k++) {
	                System.out.print(value + " ");
	                value = value * (i - k) / (k + 1);
	            }
	            
	            System.out.println("");
	        }
	    }}