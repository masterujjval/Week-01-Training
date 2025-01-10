import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 to stop the program): ");
            double input = sc.nextDouble();

            if (input==0) break;// if user enters 0 then our loop will break
            total +=input; // summing up the numbers
        }

        System.out.println("Total sum: " + total); // printing the total value of numbers entered by the user
    }
}

