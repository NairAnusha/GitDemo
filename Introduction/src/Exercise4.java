
public class Exercise4 {

	public static void main(String[] args) {
		
		
		// 3 
		// 6 9
		// 12 15 18
		int k=3;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(k);
				System.out.print("\t");
				k=k+3;
			}
			System.out.println("");
		}
	}

}
