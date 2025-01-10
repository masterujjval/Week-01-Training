import java.util.Scanner;
public class Test{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal amount: ");
		double principal=sc.nextDouble(); // enters principal amount
						 

		System.out.println("Enter rate of interest: ");
		double rate=sc.nextDouble();


		System.out.println("Enter Time duration: ");
		double time=sc.nextDouble();
		
		double sI=(principal*rate*time)/100;


		System.out.println(" The Simple Interest is "+sI+" for Principal "+ principal+" Rate of Interest "+ rate+" and Time "+time);



		// Simple Interest = Principal * Rate * Time / 100
		
	}
}
