

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
		//Create a program to find the power of a number.

        Scanner sc = new Scanner(System.in);

        //Taking input
        System.out.print("Enter the base number: ");
        int baseNumber = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        int result = 1;

        // Calculating the power using for loop can use Math.pow() too
        for (int i = 1; i <= power; i++) {
            result*=baseNumber; 
        }
        // result
        System.out.println(baseNumber+ " raised to the power "+ power + " is: "+result);
    }
}






