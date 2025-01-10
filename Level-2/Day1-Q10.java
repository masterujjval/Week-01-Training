import java.util.Scanner;
public class Test{
	public static void main(String []args){
		 // number of chocolates
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of chocolates to be distributed: ");
		int  numberOfchocolates=sc.nextInt();


		System.out.println("Enter number of childrens to distirbute chocolats among them: ");
		int  numberOfchildrens=sc.nextInt();

		System.out.println("The number of chocolates each child gets is "+(numberOfchocolates/numberOfchildrens)+" the number of remaining chocolates are "+(numberOfchocolates%numberOfchildrens));
	}
}
