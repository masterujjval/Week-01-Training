import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base : ");
        double base = sc.nextDouble();
        System.out.print("Enter height : ");
        double height = sc.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaIn = areaCm * 6.4516; // 1 square inch = 6.4516 square cm

        System.out.printf("Area of the triangle: %.2f cm sq or %.2f cmIn \n", areaCm, areaIn);
    }
}

