import java.util.Scanner;
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        if (number <0) { // will show this message when user enters negative number
            System.out.println("Please enter a positive integer.");
        } else {
            int factorial = 1; // as we are multiplying thats why we took factorial as 1 not 0
            int i = 1;

            while (i <= number) {
                factorial *= i; 
                i++; // incrementing i by 1;
            }

            System.out.println("The factorial of " + number + " is " + factorial);
        }
    }
}

