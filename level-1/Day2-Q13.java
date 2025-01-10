import java.util.Scanner;
public class SumNaturalFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n > 0) {
            int sumFormula = n * (n + 1) / 2; // using the sum of n natural numbers
            int sumLoop = 0;
	for (int i = 1; i <= n; i++) { // using for loop to sum the num from 1 to n
                sumLoop +=i;
            }

            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using loop: " + sumLoop);
        } else
       	{
            System.out.println("Not a natural number");
        }	
    }
}

