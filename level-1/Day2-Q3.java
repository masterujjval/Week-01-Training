import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
	// Taking three numbers without getting line break
        int num1 =sc.nextInt(),num2 =sc.nextInt(),num3=sc.nextInt();
        System.out.println("Is the first number the largest? " + (num1 > num2 && num1 > num3)); //check if the num1 is largest or not

        System.out.println("Is the second number the largest? " + (num2 > num1 && num2 > num3)); // check if the num2 is largest or not
        System.out.println("Is the third number the largest? " + (num3 > num1 && num3 > num2)); // check if the num3 is largest or not
 
    }
}

