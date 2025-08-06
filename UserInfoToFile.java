import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInfoToFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            try (FileWriter fw = new FileWriter("userinfo.txt")) {
                fw.write("Name: " + name + "\n");
                fw.write("Age: " + age + "\n");
                fw.write("Favorite Programming Language: " + language + "\n");
            }

            System.out.println("Information saved to userinfo.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
