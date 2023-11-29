package practiceproject7;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "ajay"; // Change this to the desired file name
        String content = "This is the content of the file.";

        try {
            File file = new File(fileName);

            // Check if the file already exists
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Write content to the file using FileOutputStream
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(content.getBytes());
            fos.close();

            System.out.println("Content has been written to the file.");

        } catch (IOException e) {
            System.err.println("An error occurred.");
            e.printStackTrace();
        }

	}

}
