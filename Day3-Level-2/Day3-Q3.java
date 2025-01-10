// Create a program to store the digits of the number in an array and find the largest and second largest element of the array.
//

import java.util.Scanner;
public class Test{
	public static void main(String args[]){	

		// Scanner class for taking inputs
		Scanner sc=new Scanner(System.in);

		int num;
		System.out.println("Enter the number: ");
		num=sc.nextInt();

		int arr[]=new int[10];
		int ind=0;
		while(num!=0||ind<10){
		int temp=num%10;
		arr[ind]=temp;
		num=num/10;
		ind++;

		}	
		int larg=0;
		int sLarg=0;
		for(int i=0;i<10;i++){
		if(arr[i]>larg)
		{sLarg=larg;
			larg=arr[i];
		}
		if((arr[i]<larg)&&arr[i]>sLarg)sLarg=arr[i];


	}
	
	System.out.println("Largest number is: "+larg+" second largest is: "+sLarg);
	
	}
}
