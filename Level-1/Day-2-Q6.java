public class Test{
	public static void main(String []args){
		int fee=125000;
		double discountPercentage=10;

		double discount=((discountPercentage/100)*125000);

		double discountedFees=fee-discount;

		System.out.println("The discount amount is INR "+ discount+" and final discounted fee is INR " + discountedFees);
	}
}
