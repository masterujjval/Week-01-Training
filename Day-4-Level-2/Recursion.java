import java.util.Scanner;

public class NaturalNumberSum {

    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumUsingRecursion(n - 1);
        }
    }

    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
            return;
        }

        int recursiveSum = sumUsingRecursion(n);
        int formulaSum = sumUsingFormula(n);

        System.out.println("Sum of the first " + n + " natural numbers (using recursion): " + recursiveSum);
        System.out.println("Sum of the first " + n + " natural numbers (using formula): " + formulaSum);

        if (recursiveSum == formulaSum) {
            System.out.println("Both results are correct and equal.");
        } else {
            System.out.println("There is a discrepancy between the two methods.");
        }
    }
}
