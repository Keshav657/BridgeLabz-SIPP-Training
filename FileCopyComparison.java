import java.io.*;

public class FileCopyComparison {
    public static void main(String[] args) {
        String source = "source.dat"; // Change to your source file path
        String destUnbuffered = "dest_unbuffered.dat";
        String destBuffered = "dest_buffered.dat";
        int bufferSize = 4096; // 4 KB

        // Unbuffered copy
        long startUnbuffered = System.nanoTime();
        copyFileUnbuffered(source, destUnbuffered, bufferSize);
        long endUnbuffered = System.nanoTime();
        System.out.println("Unbuffered copy time: " + (endUnbuffered - startUnbuffered) / 1_000_000 + " ms");

        // Buffered copy
        long startBuffered = System.nanoTime();
        copyFileBuffered(source, destBuffered, bufferSize);
        long endBuffered = System.nanoTime();
        System.out.println("Buffered copy time: " + (endBuffered - startBuffered) / 1_000_000 + " ms");
    }

    // Unbuffered file copy
    public static void copyFileUnbuffered(String src, String dest, int bufferSize) {
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {
            byte[] buffer = new byte[bufferSize];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Unbuffered copy error: " + e.getMessage());
        }
    }

    // Buffered file copy
    public static void copyFileBuffered(String src, String dest, int bufferSize) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {
            byte[] buffer = new byte[bufferSize];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Buffered copy error: " + e.getMessage());
        }
    }
}