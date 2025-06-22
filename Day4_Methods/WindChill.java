import java.util.Scanner;

public class WindChill {

    public static double calculateWindChill(double temperature, double windSpeed) {
        return 13.12 + 0.6215 * temperature - 11.37 * Math.pow(windSpeed, 0.16) + 0.3965 * temperature * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature (Celsius): ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter wind speed (km/h): ");
        double windSpeed = scanner.nextDouble();
        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.printf("Wind Chill Temperature: %.2f\n", windChill);
        scanner.close();
    }
}
