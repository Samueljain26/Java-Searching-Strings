import java.io.*;

public class ConvertStream{
    public static void main(String[] args) {
        String fileName = "demo.txt";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
/*demo file
hello world
hello world
hello world
hello world
v
v
hello world
 */