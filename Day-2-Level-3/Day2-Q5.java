/*Write a program DayOfWeek that takes a date as input and prints the day of the week that the date falls on. Your program should take three command-line arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas, for the Gregorian calendar (where / denotes integer division):
y0 = y − (14 − m) / 12
x = y0 + y0/4 − y0/100 + y0/400
m0 = m + 12 × ((14 − m) / 12) − 2
d0 = (d + x + 31m0 / 12) mod 7

*/
import java.util.Scanner;
public class DayofWeek{
	public static void main(String []args){
		System.out.println("Program to print the Day of the week !");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the year: ");
		int y=sc.nextInt();
		
		System.out.println("Enter the month (1-12)");
		int m=sc.nextInt();

		System.out.println("Enter the date: ");
		int date=sc.nextInt();

		//Perform calculations 

		int day;

		y=y-((14-m)/12);
		int x=y+(y/4)-(y/100)+(y/400);
		m=m+12*((14-m)/12)-2;
		day=(date+x+31*m/12)%7;

		switch(day){
			case 0: System.out.println("Its Sunday!" );
			break;

			case 1: System.out.println("Its Monday!" );break;

			case 2: System.out.println("Its Tuesday!" );break;
				
			case 3: System.out.println("Its Wednesday!" );break;


			case 4: System.out.println("Its Thursday!" );break;

			case 5: System.out.println("Its Friday!" );break;
				
			case 6: System.out.println("Its Saturday!" );break;

		}
	}}

