import java.io.*;

public class BufferedStreams {
    public static void main(String[] args) {
        String sourcePath = "source.txt";
        String destPathUnbuffered = "destination_unbuffered.txt";
        String destPathBuffered = "destination_buffered.txt";

        // Unbuffered copy
        long startUnbuffered = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(sourcePath);
             FileOutputStream fos = new FileOutputStream(destPathUnbuffered)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Unbuffered copy error: " + e.getMessage());
        }
        long endUnbuffered = System.nanoTime();
        System.out.println("Unbuffered copy time: " + ((endUnbuffered - startUnbuffered) / 1_000_000) + " ms");

        // Buffered copy
        long startBuffered = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourcePath));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destPathBuffered))) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Buffered copy error: " + e.getMessage());
        }
        long endBuffered = System.nanoTime();
        System.out.println("Buffered copy time: " + ((endBuffered - startBuffered) / 1_000_000) + " ms");
    }
}
