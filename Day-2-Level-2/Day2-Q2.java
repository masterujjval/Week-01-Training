import java.util.Scanner;

public class Test{
	public static void main(String []args){
		System.out.println("Enter a year to check for Leap Year: "); // prompting user to enter year to check if its a leap year or not 
									
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();

		// checking for leap year 
		if(year>=1582){
			if(year%400==0){
				System.out.println(year+ " Year is a leap year");
			}
			else if(year%4==0){
				if(year%100!=0){ 
				System.out.println(year+ " Year is a leap year");
				}
		}

		else {
			System.out.println(year+ " year it is not a leap year");
		}
		sc.close();
	}
	else{ System.out.println("Year is not valid ");}

}
}

