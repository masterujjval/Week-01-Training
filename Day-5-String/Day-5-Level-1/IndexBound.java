import java.util.Scanner;

public class IndexBound{
	
	public static void generated(String s){
		
		String text=s;
		

		try{
		
		System.out.println("Character at "+s.charAt(s.length()));
		}
		catch(Exception e){
			System.out.println("found an error :- "+e.getMessage());
	
	}
	}
	
			
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter the string :- ");
String t= sc.nextLine();
System.out.println();

      generated(t);
		
           }
}
