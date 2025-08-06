import java.io.*;

public class StudentDataStreamDemo {
    public static void main(String[] args) {
        String filename = "studentdata.bin";
        // Write data
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            dos.writeInt(101);
            dos.writeUTF("Alice");
            dos.writeDouble(8.7);
            dos.writeInt(102);
            dos.writeUTF("Bob");
            dos.writeDouble(9.1);
            System.out.println("Student data written to file.");
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }

        // Read data
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            while (dis.available() > 0) {
                int roll = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll: " + roll + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}
