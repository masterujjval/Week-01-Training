import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) { //using scanner for taking input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.printf("The maximum number of handshakes among %d students is %d \n", numberOfStudents, handshakes);
    }
}

