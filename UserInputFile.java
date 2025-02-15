import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        String fileName = "user_input.txt";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            System.out.println("Enter text (type 'exit' to stop):");

            String input;
            while (!(input = reader.readLine()).equalsIgnoreCase("exit")) {
                writer.write(input);
                writer.newLine();
            }

            System.out.println("User input saved to " + fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

