// Create a program to check if a number taken from the user is a Harshad Number.

import java.util.Scanner;
public class Test{
	public static void main(String []args){

		Scanner sc=new Scanner(System.in);
		// Prompting user to enter to number to check for Harshad number
		System.out.println("Enter an integer to check if its a Harshad number: ");

		int num=sc.nextInt();

		// Now perform calculations
	
		int sum=0;
		int org=num; //storing original number for calculation
			

		while(num!=0){
			int temp=num%10;
			sum+=temp;
			num=num/10;
		}
		if(org%sum==0){
			System.out.println("Its a Harshad Number");
		}else{
				System.out.println("Its not a Harshad Number");
			}
		sc.close();

	}
}
