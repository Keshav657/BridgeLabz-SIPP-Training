import java.lang.Math;
public class Q8_PowerCalc {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();
        
        double result = Math.pow(base, exponent);
        
        System.out.println("Result: " + result);
        
        scanner.close();
    }
    
}
