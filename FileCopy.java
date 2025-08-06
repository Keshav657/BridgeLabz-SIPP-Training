import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String sourcePath = "source.txt";
        String destPath = "destination.txt";

        File sourceFile = new File(sourcePath);

        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist: " + sourcePath);
            return;
        }

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destPath)) {

            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                fos.write(byteRead);
            }
            System.out.println("File copied successfully to " + destPath);

        } catch (IOException e) {
            System.out.println("An error occurred during file operation: " + e.getMessage());
        }
    }
}
