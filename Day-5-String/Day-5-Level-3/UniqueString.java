import java.util.Scanner;

public class UniqueString {

    // Method to find the length of the text without using the length() method
    public static int findLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception indicates the end of the string
        }
        return length;
    }

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] tempResult = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the current character is already in the result array
            for (int j = 0; j < uniqueCount; j++) {
                if (tempResult[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the result array
            if (isUnique) {
                tempResult[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array with the exact size of unique characters
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = tempResult[i];
        }

        return uniqueChars;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string to find unique characters:");
        String input = scanner.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(input);

        // Display the result
        System.out.println("Unique characters in the string:");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }

        scanner.close();
    }
}

