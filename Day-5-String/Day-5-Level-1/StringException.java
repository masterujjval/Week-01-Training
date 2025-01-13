import java.util.Scanner;
import java.lang.Integer;

public class StringException { // Write a program to demonstrate NumberFormatException
	
	public static int generated(String s){
		
		int k=0; // k initialize
		
		try{
		k=Integer.parseInt(s);
		System.out.println("The integer value is :- "+k);
		}
		catch(NumberFormatException e){
	System.out.println("Here us the another error: "+e.getMessage());
	}
		catch(RuntimeException e){
			System.out.println("Here is the error :- "+e.getMessage());
	}
	
	return k;
	}
	
	
			
    public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.print("Enter the string :- ");
String t= sc.nextLine();
System.out.println();

      generated(t);
		
           }
}
