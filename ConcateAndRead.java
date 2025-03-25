import java.io.*;
import java.util.*;

public class ConcateAndRead {

    public static void main(String[] args) {
        String str = "hello";

        // Compare StringBuffer
        long startBuffer = System.nanoTime();
        concatenateBuffer(str);
        long endBuffer = System.nanoTime();
        System.out.println("Time taken by StringBuffer: " + (endBuffer - startBuffer) + " ns");

        // Compare StringBuilder
        long startBuilder = System.nanoTime();
        concatenateBuilder(str);
        long endBuilder = System.nanoTime();
        System.out.println("Time taken by StringBuilder: " + (endBuilder - startBuilder) + " ns");

        // File reading comparison
        String filePath = "demo.txt";

        // Using FileReader
        long startFileReader = System.nanoTime();
        int wordCountFileReader = countWordsUsingFileReader(filePath);
        long endFileReader = System.nanoTime();
        System.out.println("Word count using FileReader: " + wordCountFileReader);
        System.out.println("Time taken by FileReader: " + (endFileReader - startFileReader) + " ns");

        // Using InputStreamReader
        long startInputStream = System.nanoTime();
        int wordCountInputStream = countWordsUsingInputStreamReader(filePath);
        long endInputStream = System.nanoTime();
        System.out.println("Word count using InputStreamReader: " + wordCountInputStream);
        System.out.println("Time taken by InputStreamReader: " + (endInputStream - startInputStream) + " ns");
    }

    // Method to concatenate using StringBuffer
    public static void concatenateBuffer(String str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append(str);
        }
    }

    // Method to concatenate using StringBuilder
    public static void concatenateBuilder(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append(str);
        }
    }

    // Method to count words using FileReader
    public static int countWordsUsingFileReader(String filePath) {
        int wordCount = 0;
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                wordCount += line.split(" ").length; // Splitting by whitespace
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return wordCount;
    }

    // Method to count words using InputStreamReader
    public static int countWordsUsingInputStreamReader(String filePath) {
        int wordCount = 0;
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath));
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                wordCount += line.split("\\s+").length; // Splitting by whitespace
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return wordCount;
    }
}
