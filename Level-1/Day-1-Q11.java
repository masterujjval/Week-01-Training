import java.util.Scanner;
public class Test{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st integer: "); // user input
		
		double x=sc.nextDouble();
			
		System.out.println("Enter 2nd Integer: "); // user input
		double y=sc.nextDouble();
		
		System.out.println("Sum is: "+ (x+y)+" Substract is: "+(x-y)+" Division is: "+(x/y)+ " Multiplication is: "+(x*y));


	}
}


