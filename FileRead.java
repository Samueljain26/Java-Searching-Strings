import java.io.*;

public class FileRead {
    public static void main(String[] args) {
        String fileName = "demo.txt";

        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) { // Read line by line
                System.out.println(line);
            }

            br.close(); // Close BufferedReader
            fr.close(); // Close FileReader

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
