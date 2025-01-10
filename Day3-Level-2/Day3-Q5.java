import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the count of digits in the number
      
        int digitCount = 0; // counting the digits so that we can use it to create an array
	int temp=number;
	while(temp!=0){
	digitCount++;
	temp=temp/10;


	}
      

        // Create an array to store the digits
        int[] digits = new int[digitCount];
        int index = 0;

        // Extract the digits and store them in the array
        while (number > 0) {
            digits[index] = number % 10; // Extract the last digit
            number /= 10; // Remove the last digit from the number
            index++;
	   
        }

        // Create an array to store the digits in reverse order
        int[] reversedDigits = new int[digitCount];
        for (int i = digitCount-1; i >=0; i--) {

            reversedDigits[i] = digits[i];
        }

        // Display the reversed array
        System.out.println("The number in reverse order is: ");
        for (int i=0;i<reversedDigits.length;i++) {
            System.out.print(reversedDigits[i]);
       }
       System.out.println("\n");
        scanner.close();
    }
}

