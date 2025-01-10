import java.util.Scanner;
public class Armstrong{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check for Armstrong number: ");
		int number=sc.nextInt();

		int sum =0;

		int originalNumber=number;

		while(originalNumber!=0){
			int temp=originalNumber;
			int temp2=temp%10;
			sum+=Math.pow(temp2,3);
			originalNumber=temp/10;
		}
		if(sum==number){System.out.println("The number is armstrong number");
		}
		else {
			System.out.println("The number is not a armstrong number");
		}
	}
}
