//Create a program to count the number of digits in an integer.

import java.util.Scanner;
public class Test{
	public static void main(String []args){
	Scanner sc=new Scanner(System.in);

	int count=0;

	System.out.println("Enter a integer to count number of digits it have: ");// take input from the users 

		int num=sc.nextInt(); // Here user have to enter the number
				      
	// Performing calculations
	int org=num; // Storing the number to display final results
	while(num!=0){
		count++;
		num=num/10;
	}
	System.out.println("Digits in "+org+" are "+ count);
	}
}


























