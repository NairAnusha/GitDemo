
public class Removecharacters {

	public static void main(String[] args) {
		
		String s="Mackbook13431#*$^&(^(Y#";
		
		String s1=s.replace("#", "123");
		
		String s2=s.replaceAll("[^a-zA-Z]","");
		
		String s3=s.replaceAll("[^0-9a-zA-Z]", "");
		
		System.out.println(s1);
		// TODO Auto-generated method stub
		System.out.println(s2);
		
		System.out.println(s3);

	}

}
