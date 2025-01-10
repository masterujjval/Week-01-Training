import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: "); // User enter the perimeter of the square
        double perimeter = sc.nextDouble();

        double side = perimeter / 4; // as square has 4 sides

        System.out.printf("The length of the side is %.2f units whose perimeter is %.2f units.%n", side, perimeter);
    }
}

