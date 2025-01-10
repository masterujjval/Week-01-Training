import java.util.Scanner;
public class CountdownFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the countdown start value: ");
        int counter = sc.nextInt();
	// here we are using for loop
        for (int i = counter; i > 0; i--) {
            System.out.println(i); // printing the value of i 
        }
        System.out.println("Liftoff!"); // i becomes 0 that means liftoff time
    }
}

