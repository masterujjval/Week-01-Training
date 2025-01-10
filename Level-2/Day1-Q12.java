import java.util.Scanner;
public class Test{
	public static void main(String []args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter weight in pounds: ");
		double p=sc.nextDouble(); // weight in pounds 
		double kg=p/2.2;

		System.out.printf("The weight of the person in pounds is %.2f and in kg is %.2f \n",p,kg);
	}
}
