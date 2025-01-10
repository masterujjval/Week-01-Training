import java.util.Scanner;
public class Test{
	public static void main(String []args){
		double km;
		
		Scanner sc=new Scanner(System.in);

		km=sc.nextDouble();

		System.out.println("The total miles is "+(km*1.6)+ " mile for the given "+km+ "km");
	}
}
