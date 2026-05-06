import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class CreateFolders {
    public static void main(String[] args) {
        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            String folderName = "Project" + i;
            try {
                // Creates the directory
                Files.createDirectories(Paths.get(folderName));
                System.out.println("Created: " + folderName);
            } catch (IOException e) {
                System.err.println("Failed to create " + folderName + ": " + e.getMessage());
            }
        }
    }
}
