import java.io.*;

public class ConsoleToFile {
    public static void main(String[] args) {
        String fileName = "demo.txt"; //

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(fileName, true)) {

            System.out.println("Enter text (type 'exit' to stop):");

            String line;
            while ((line = reader.readLine()) != null) { // Read input
                if (line.equals("exit")) { // Stop when user types "exit"
                    break;
                }
                writer.write(line + "\n");
            }

            System.out.println("Data saved to " + fileName);
        } catch (IOException e) {
            System.out.println("Error occurred while writing to file.");
        }
    }
}
/*Enter text (type 'exit' to stop):
hello
world
exit
Data saved to demo.txt
 */