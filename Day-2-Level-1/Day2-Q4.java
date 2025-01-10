import java.util.Scanner;
public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	// User enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) { // checks if the number is greater than zero as it has to be a natural number
            int sum = number*(number + 1)/2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else { // if the number is not a natural number or is less than or equal to zero then this clause will be executed
            System.out.println("The number " + number + " is not a natural number");
        }
       
    }
}

