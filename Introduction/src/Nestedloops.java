
public class Nestedloops {

	public static void main(String[] args) {
		int k=1;
		for(int i=0;i<4;i++) {
			
			for(int j=1;j<=4-i;j++) 
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
		// TODO Auto-generated method stub

	}

}
