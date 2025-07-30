import java.util.Scanner;

public class Palindromeuserinput {

	public static void main(String[] args) {	
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a word: ");
		String s1=scanner.nextLine();

		String t="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			t=t+s1.charAt(i);
		}
		if(t.equals(s1)) {
			System.out.println( s1+ " is palindrome");
		
		}
		else
		{
			System.out.println(t+ " is not palindrome");
		}}}