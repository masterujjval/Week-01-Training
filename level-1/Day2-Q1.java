import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
	 // taking input using scanner 
        Scanner sc = new Scanner(System.in);
	// user will enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Is the number "+number +" divisible by 5? " +(number%5==0));
    }
}

