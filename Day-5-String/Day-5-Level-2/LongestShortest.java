import java.util.Scanner;

public class LongestShortest {

    // Method to split the text into words using charAt() method
    public static String[] splitTextIntoWords(String text) {
        StringBuilder word = new StringBuilder();
        String[] words = new String[text.length()];  // An array to store words
        int wordCount = 0;

        // Iterate over each character in the text to split words
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // If character is not a space, add it to the word
            if (ch != ' ') {
                word.append(ch);
            } else {
                // If space is encountered, store the word
                if (word.length() > 0) {
                    words[wordCount++] = word.toString();
                    word.setLength(0);  // Clear the word builder
                }
            }
        }

        // Add the last word to the array
        if (word.length() > 0) {
            words[wordCount++] = word.toString();
        }

        // Create a new array to remove unused slots
        String[] result = new String[wordCount];
        System.arraycopy(words, 0, result, 0, wordCount);

        return result;
    }

    // Method to find and return a string's length without using the length() method
    public static int getStringLength(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string reached
        }
        return length;
    }

    // Method to create a 2D array of word and its corresponding length
    public static String[][] createWordLengthArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i];  // Store word
            wordLengthArray[i][1] = String.valueOf(getStringLength(words[i]));  // Store word length
        }

        return wordLengthArray;
    }

    // Method to find the shortest and longest string based on length
    public static String[] findShortestAndLongest(String[][] wordLengthArray) {
        int shortestLength = Integer.MAX_VALUE;
        int longestLength = Integer.MIN_VALUE;
        String shortestWord = "";
        String longestWord = "";

        for (int i = 0; i < wordLengthArray.length; i++) {
            int length = Integer.parseInt(wordLengthArray[i][1]);

            if (length < shortestLength) {
                shortestLength = length;
                shortestWord = wordLengthArray[i][0];
            }

            if (length > longestLength) {
                longestLength = length;
                longestWord = wordLengthArray[i][0];
            }
        }

        return new String[]{shortestWord, longestWord};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        // Split the text into words
        String[] words = splitTextIntoWords(text);

        // Create the 2D array of words and their corresponding lengths
        String[][] wordLengthArray = createWordLengthArray(words);

        // Find the shortest and longest words
        String[] result = findShortestAndLongest(wordLengthArray);

        // Display the result
        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);

        scanner.close();
    }
}

