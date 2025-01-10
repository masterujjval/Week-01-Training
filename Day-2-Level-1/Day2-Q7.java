import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month i.e 1-12: ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();
	// checking if its march and date is more than 19, and checking if it comes under june and less than day 21
        if ((month == 3 &&day>= 20) ||(month==4) ||(month==5)|| (month==6&&day<=20)){
            System.out.println("It's a Spring Season");
        } else
	{
            System.out.println("Not a Spring Season");
        }
    }
}

