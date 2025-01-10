import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        int a = sc.nextInt();
        System.out.print("Enter value for b: ");
        int b = sc.nextInt();


        System.out.print("Enter value for c: ");
        
	int c = sc.nextInt();

        int result1 = a + b * c; // first operation 
        int result2 = a * b + c;// second ops
				
        int result3 = c + a / b;// third operation
        int result4 = a % b + c;// fourth operation

        System.out.printf("The results of Int Operations are %d, %d, %d, and %d \n", result1, result2, result3, result4);
    }
}

