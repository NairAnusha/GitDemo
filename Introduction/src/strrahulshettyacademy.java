
public class strrahulshettyacademy {

	public static void main(String[] args) {
 // TODO Auto-generated method stub

//String : it is one of the pre-built class in java
		/* 1.String literal, 2.by creating object of string*/  
		
			 String a= " javatraining";
			
			 System.out.println(a.indexOf("n"));
			 System.out.println(a.substring(3, 6)); 
			 System.out.println(a.substring(5)); 
			 System.out.println(a.concat(" rahul teaches")); 
		   System.out.println(a.trim()); 
		   System.out.println(a.toUpperCase()); 
		   System.out.println(a.toLowerCase()); 
			 String arr[]=a.split("t"); 
			 System.out.println(arr[0]); 
			 System.out.println(arr[1]); 
			 System.out.println(a.replace("t", "s"));       

		  }  
	}
