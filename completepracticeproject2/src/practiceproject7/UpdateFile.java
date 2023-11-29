package practiceproject7;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class UpdateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "example.txt"; // Replace with the name of the file you want to update
        String newText = "This is the updated content.";
        try {
            File file = new File(fileName);
            if (file.exists()) {
                // Read the existing content
                Scanner scanner = new Scanner(file);
                StringBuilder content = new StringBuilder();
                while (scanner.hasNextLine()) {
                    content.append(scanner.nextLine()).append("\n");
                }
                scanner.close();
                // Modify the content
                content.append(newText);

                // Write the updated content back to the file
                FileWriter writer = new FileWriter(file);
                writer.write(content.toString());
                writer.close();
                System.out.println("File has been updated.");

            } else {
                System.out.println("File does not exist.");
            }
        } catch (IOException e) {
            System.err.println("An error occurred.");
            e.printStackTrace();
        }


	}

}
