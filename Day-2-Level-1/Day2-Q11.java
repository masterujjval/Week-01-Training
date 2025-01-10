import java.util.Scanner;
public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        while (true){
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            if (input <=0) break; // break the loop when the entered number is less than or equal to zero
            total += input; // summing up all the numbers
        }
        System.out.println("Total sum: " + total); // printing the sum of all numbers
 
    }
}

