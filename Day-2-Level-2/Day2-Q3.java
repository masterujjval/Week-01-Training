import java.util.Scanner;
public class Test{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Phyiscs Marks out of 100 : ");
		double phy=sc.nextDouble();

		System.out.println("Enter Chemistry Marks out of 100 : ");
		double chem=sc.nextDouble();

		System.out.println("Enter Maths Marks out of 100 : ");
		double maths=sc.nextDouble();
		
		double sum=(maths+phy+chem)/3;

		if(sum>=80){
		System.out.println("Grade                   Remarks                                      Marks \n A    \t \t (Level 4, above agency-normalised standards) \t \t 80% and above");
		}
		else if(70<=sum &&sum<=79){
		
		System.out.println("Grade                   Remarks                                       Marks \n B     \t \t (Level 3, at agency-normalised standards) \t \t 70%-79%");
		}

		else if(60<=sum && sum<=69){
		
		System.out.println("Grade                   Remarks                                                             Marks \n C    \t \t (Level 2, below, but approaching agency-normalised standards) \t \t 60%-69%");
		}
		else if(50<=sum&& sum<=59){
		
		System.out.println("Grade                   Remarks                                       Marks \n D     \t \t (Level 1, well below agency-normalised standards) \t \t  50%-59%");
		}

		else if(40<=sum&&sum<=49){
		
		System.out.println("Grade                   Remarks                                        Marks \n E     \t \t (Level 1, too below agency-normalised standards) \t \t 40%-49%");
		}

		else if(sum<=39){
		
		System.out.println("Grade                   Remarks                                          Marks \n R     \t \t Remedial required \t \t \t \t \t 39% and below");
		}

	}
}





























