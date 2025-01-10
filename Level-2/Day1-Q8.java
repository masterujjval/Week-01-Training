import java.util.Scanner;

public class TravelDetailsWithUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input user details
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter the starting city: ");
        String fromCity = sc.nextLine();
        System.out.print("Enter the via city: ");
        String viaCity = sc.nextLine();
        System.out.print("Enter the destination city: ");
        String toCity = sc.nextLine();

        // Input distances
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity );
        double distanceFromToVia = sc.nextDouble();
        System.out.print("Enter the distance from " + viaCity + " to " + toCity );
        double distanceViaToFinalCity = sc.nextDouble();

        // Input time taken simple by maths
        System.out.print("Enter the total time taken in hours: ");
        double timeTaken = sc.nextDouble();

        // total distance
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;

        // speed distance
        double speed = totalDistance / timeTaken;

       
        System.out.println("\nTravel Details:");
        System.out.println("Name: " + name);
        System.out.println("Route: " + fromCity + " To" + viaCity + " To  " + toCity);
        System.out.printf("Total Distance: %.2f miles \n", totalDistance);
        System.out.printf("Time Taken: %.2f hours \n", timeTaken);
        System.out.printf("Average Speed: %.2f miles per hour \n", speed);

        
    }
}

