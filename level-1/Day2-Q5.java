
import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        // Now we will check the person age for voting eligibility
        if (age >= 18) { // age is greather than or equal to 18 means eligilble to vote
            System.out.println("The person's age is "+age+ " and can vote.");
        } else
	{ // or if less than 18 not eligible to vote
            System.out.println("The person's age is "+age+" and cannot vote.");
        }
       
    }
}

