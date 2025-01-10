import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        // Create arrays to store height, weight, BMI, and status
        double[] heights = new double[numPersons];
        double[] weights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] statuses = new String[numPersons];

        // Input height and weight for each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Height (in metres): ");
            heights[i] = scanner.nextDouble();
            System.out.print("Weight (in kilograms): ");
            weights[i] = scanner.nextDouble();
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < numPersons; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]); // BMI formula

            // Determine weight status based on BMI
            if (bmis[i] < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmis[i] >= 25 && bmis[i] < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obesity";
            }
        }

        // Display height, weight, BMI, and status of each person
        System.out.println("\nDetails of each person:");
        System.out.printf("Height \t\t Weight \t\t  BMI  \t\t Status\n");
        for (int i = 0; i < numPersons; i++) { 
            System.out.printf("%.2f \t\t %.2f \t\t %.2f \t\t %s \n", heights[i], weights[i], bmis[i], statuses[i]);
        }

        scanner.close();
    }
}

