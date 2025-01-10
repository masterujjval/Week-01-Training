import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
	// checking if number is 0 or not
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else { // if number is greater than 0 than we will get the factorial
            int factorial = 1;

            for (int i = 1; i <= number; i++) { // using for loop to get the factorial of a number
                factorial *= i; 
            }

            System.out.println("The factorial of " + number + " is " + factorial);
        }
    }
}

