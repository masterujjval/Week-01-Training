import java.util.Scanner;

public class CharacterFrequencyNestedLoop {

    // Method to find the frequency of characters in a string
    public static String[] findFrequency(String text) {
        char[] characters = text.toCharArray();  // Convert string to character array
        int[] frequency = new int[characters.length];  // Array to store frequencies
        StringBuilder result = new StringBuilder();

        // Outer loop to iterate through each character in the text
        for (int i = 0; i < characters.length; i++) {
            // If the character is not counted yet
            if (characters[i] != '0') {
                int count = 1;  // Initialize count to 1 for the current character

                // Inner loop to check for duplicates and count frequency
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        count++;  // Increment count if a duplicate is found
                        characters[j] = '0';  // Set the duplicate character to '0' to avoid recounting
                    }
                }

                // Store the character and its frequency
                result.append("Character: ").append(characters[i]).append(" Frequency: ").append(count).append("\n");
            }
        }

        // Convert the result to an array of strings
        return result.toString().split("\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Calling the method to find frequencies
        String[] frequencies = findFrequency(inputString);

        // Displaying the result
        System.out.println("Character Frequencies:");
        for (String frequency : frequencies) {
            if (!frequency.isEmpty()) {
                System.out.println(frequency);
            }
        }

        scanner.close();
    }
}

