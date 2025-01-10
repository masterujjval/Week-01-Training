import java.util.Scanner;
public class NaturalNumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >0) {
            int sumFormula = n * (n + 1) / 2; // sum using formula 
            int sumLoop = 0, i = 1; // as we are going to sum the num from 1 to the given num

            while (i<=n) {
                sumLoop += i;
		i++; // incrementing the i so that it wont stuck at infinity
            }

            System.out.println("Sum using formula: " +sumFormula);
            System.out.println("Sum using loop: " +sumLoop);
        } else {
            System.out.println("Not a natural number");
        }
      
    }
}

