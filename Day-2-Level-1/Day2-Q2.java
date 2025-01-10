import java.util.Scanner;
public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
	// User enter theree numbers without line break
        int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();
        System.out.println("Is the first number the smallest? " +(num1 <num2 &&num1 <num3));
        
    }
}

