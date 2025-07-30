
public class Exercise5 {

	public static void main(String[] args) {
		// 1 2 3 4
		// 1 2 3
		// 1 2 
		// 1 
				
				for(int i=1;i<=4;i++) {
					
					for(int j=1;j<=5-i;j++) {
						System.out.print(j);
						System.out.print("\t");
									
					}
					System.out.println("");
				}

			}

}
