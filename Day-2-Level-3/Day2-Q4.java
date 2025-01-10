//Create a program to check if a number is an Abundant Number.

import java.util.Scanner;
public class Test{
	public static void main(String []check){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number to check if its a Abundant number: ");
		int number=sc.nextInt();

		int sum=0;
		for(int i=1;i<=number/2;i++){
			if(number%i==0){
				sum+=i;
			}
		}// checkin if a number is abuundant or not using conditional statements
		if(sum>number){System.out.println("Its a abundant number ");}
		else{
			System.out.println("Its not a Abundant Number");
		}
		sc.close();
	}
}
