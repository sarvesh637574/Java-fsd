package practiceproject7;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "Nisha"; // Replace with the name of the file you want to read
        try {
            File file = new File(fileName);
            // Check if the file exists
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                byte[] data = new byte[(int) file.length()];
                fis.read(data);
                fis.close();
                String content = new String(data, "UTF-8");
                System.out.println("File content:");
                System.out.println(content);
            } else {
                System.out.println("File does not exist.");
            }

        } catch (IOException e) {
            System.err.println("An error occurred.");
            e.printStackTrace();
        }

	}

}
