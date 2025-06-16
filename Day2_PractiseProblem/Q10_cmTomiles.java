public class Q10_cmTomiles {
    public static void main(String[] args) {
        // Conversion factor from centimeters to miles
        final double CM_TO_MILES = 0.00000621371;

        // Example: Convert 100000 centimeters to miles
        double centimeters = 100000; // You can change this value to convert different lengths
        double miles = centimeters * CM_TO_MILES;

        // Output the result
        System.out.println(centimeters + " centimeters is equal to " + miles + " miles.");
    }
}
