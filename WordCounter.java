import java.io.*;

public class WordCounter {
    public static void main(String[] args) {
        String fileName = "demo.txt";
        String targetWord = "hello";

        int count = countWordOccurrences(fileName, targetWord);
        System.out.println("The word '" + targetWord + "' appears " + count + " times in the file.");
    }

    public static int countWordOccurrences(String fileName, String targetWord) {
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.equals(targetWord)) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        return count;
    }
}
/*The word 'hello' appears 5 times in the file.
 */