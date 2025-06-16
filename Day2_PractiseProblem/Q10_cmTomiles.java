import java.util.Scanner;
public class Q10_cmTomiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in centimeters: ");
        double cm = sc.nextDouble();
        
        // Convert centimeters to miles
        double miles = cm / 160934.4; // 1 mile = 160934.4 cm
        
        System.out.printf("%.2f centimeters is equal to %.6f miles\n", cm, miles);
    }
}
