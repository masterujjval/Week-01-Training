import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store ages and heights
        int[] ages = new int[3];
        int[] heights = new int[3];
        String names[] = {"Amar", "Akbar", "Anthony"}; // create string array so that we dont have to take input three different times

        // Input ages and heights for the 3 friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter the height (in cm) of " + names[i] + ": ");
            heights[i] = scanner.nextInt();
        }

        // Variables to find the youngest and tallest
        int young= 0;
        int tall= 0;

        // Loop through the arrays to find the youngest and tallest among the friends
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[young]) 
	    {young= i;
	    }
            
	    if (heights[i] > heights[tall]) {
                tall= i;
            }
        }

           // display the results at end
        System.out.println("The youngest friend is " + names[young] + " with age " + ages[young]);
        System.out.println("The tallest friend is " + names[tall] + " with height " + heights[tall] + " cm");

        scanner.close();
    }
}

