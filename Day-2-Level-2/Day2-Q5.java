import java.util.Scanner;

public class FizzBuzzFor{
    public static void main(String[] args) {
		// Scanner for taking input
        Scanner scanner = new Scanner(System.in);
         //Taking input
         System.out.print("Enter a positive integer for FizzBuzz: ");
        int number = scanner.nextInt();

        // Checking if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
           
              for (int i = 1; i <= number; i++) {
                // Checking conditions for Fizz, Buzz, and FizzBuzz
                if (i % 3== 0 &&i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3==0) {
                    System.out.println("Fizz");
                } else if (i %5 ==0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println("No match is found "+i); // Print if no mathes were found
                }
            }
        }
    }
}










