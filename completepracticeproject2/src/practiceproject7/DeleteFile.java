package practiceproject7;
import java.io.File;
public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "example.txt"; // Replace with the name of the file you want to delete

        try {
            File file = new File(fileName);

            if (file.exists()) {
                if (file.delete()) {
                    System.out.println("File deleted successfully.");
                } else {
                    System.err.println("Failed to delete the file.");
                }
            } else {
                System.out.println("File does not exist.");
            }

        } catch (Exception e) {
            System.err.println("An error occurred.");
            e.printStackTrace();
        }

	}

}
