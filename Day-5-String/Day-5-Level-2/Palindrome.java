import java.util.Scanner;
public class Palindrome{


public static boolean helper(String s){

int i=0;
int j=s.length()-1;

while(i<=j){

if(s.charAt(i)!=s.charAt(j))return false;

i++;
j--;

}
return true;




}


	public static void main(String args[]){
	
		// Porgram to check if string is palindrome or not 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to check if its palindrome or not");
		String s=sc.nextLine();
		
		System.out.println("The string is palindrome?: "+ helper(s));


	}
 }
