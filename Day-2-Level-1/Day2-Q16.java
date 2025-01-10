import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
	// checks if the number is less than or equal to zero
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else { // now we will compute if the number is even or odd using for loop
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) { // if number is divisible by 2 then it is even
                    System.out.println(i + " is an even number.");
                } else { // not divisible by 2 then it is a odd number
                    System.out.println(i + " is an odd number.");
                }
            }
        }
    }
}

