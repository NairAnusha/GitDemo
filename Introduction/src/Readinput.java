import java.util.Scanner;

public class Readinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("what is your name");

String name=sc.nextLine();

System.out.println("your age");

int age=sc.nextInt();

System.out.println("hello " +name + " "  +age);
sc.close();
	}

}
