import java.util.Scanner;
public class Test{
	public static void main(String []args){
		int fee;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Fees: ");
		fee=sc.nextInt();
	
		System.out.println("Enter Discount Percentage: "); // User input for discount
		double discountPercentage=sc.nextDouble();
		
		
		double discount=((discountPercentage/100)*fee); // calculate the discount

		double discountedFees=fee-discount;

		System.out.println("The discount amount is INR "+ discount+" and final discounted fee is INR " + discountedFees);
	}
}
