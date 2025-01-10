

//  1 foot = 12 inches and 1 inch = 2.54 cm  12 inches=30.48
import java.util.Scanner;
public class Test{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Height in centimeters: "); // user input
		double cm=sc.nextDouble();
		
		double feet=(cm/30.48);

		double inches=(feet-(int)feet)*12;

		System.out.println("Enter Fees: ");
			System.out.printf(" Your Height in cm is "+ cm+ " while in feet is "+(int) feet + " and inches is %.2f inches \n", inches);
	}
}



