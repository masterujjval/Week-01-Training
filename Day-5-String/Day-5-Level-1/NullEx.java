import java.util.Scanner;

public class NullPointerEx {
	
	public static void ex(){
		String text=null; // text is set to null for generating null pointer exception
		
		try{
		
		System.out.println("null pointer exception is"+text.length());
		}
		catch(NullPointerException e){
			System.out.println("Null pointer exception is "+e.getMessage()); // here we generated error
	}
	}
	
	
			
    public static void main(String[] args) {
		
      ex(); 
		
           }
}
