import java.util.Scanner;

public class QuotientReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt(); // user input for 1st number 
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt(); // user input for 2nd number 

        int quotient = number1 / number2;
        int remainder = number1 % number2; 

        System.out.printf("The Quotient is %d and Remainder is %d of two numbers %d and %d.%n", quotient, remainder, number1, number2);
    }
}

