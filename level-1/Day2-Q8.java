import java.util.Scanner;
public class CountdownWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the countdown Timer: ");
        int counter = sc.nextInt();

        while (counter>0) { // counts till we have value greater than 0
            System.out.println(counter);
            counter--; // decrements the counter
        }
        System.out.println("Liftoff!"); // This means our counter reached 0 i.e liftoff
    }
}

