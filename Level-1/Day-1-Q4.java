public class Test{
	public static void main(String []args){
		// Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 
	
		int profit=191;
		int cost=129;

		System.out.println("The cost price in INR is "+cost+ " and Selling price is in INR is "+ profit);
		System.out.println("The Profit in INR is "+(profit-cost)+" and the Profit Percentage is "+(((double)profit/(double)cost)*100));
	}
}

