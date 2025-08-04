package Encap_Poly;
import java.util.ArrayList;

// Insurable interface
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract Vehicle class
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Encapsulation: Getters and Setters
    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }
    public String getInsurancePolicyNumber() { return insurancePolicyNumber; }
    public void setInsurancePolicyNumber(String insurancePolicyNumber) { this.insurancePolicyNumber = insurancePolicyNumber; }

    // Abstract method
    public abstract double calculateRentalCost(int days);
}

// Car subclass
class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 0.05 * getRentalRate(); // 5% of rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + getInsurancePolicyNumber();
    }
}

// Bike subclass
class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9; // 10% discount for bikes
    }

    @Override
    public double calculateInsurance() {
        return 0.03 * getRentalRate(); // 3% of rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + getInsurancePolicyNumber();
    }
}

// Truck subclass
class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500; // Flat fee for trucks
    }

    @Override
    public double calculateInsurance() {
        return 0.1 * getRentalRate(); // 10% of rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + getInsurancePolicyNumber();
    }
}

// Utility class for polymorphism
class RentalUtils {
    public static void printRentalAndInsurance(ArrayList<Vehicle> vehicles, int days) {
        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.getType() + " (" + v.getVehicleNumber() + ")");
            double rentalCost = v.calculateRentalCost(days);
            System.out.println("Rental Cost for " + days + " days: " + rentalCost);
            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println(ins.getInsuranceDetails());
                System.out.println("Insurance Cost: " + ins.calculateInsurance());
            }
            System.out.println("---");
        }
    }
}

// Demo
public class VehicleRentalSystem {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR123", 1000, "C-INS-001"));
        vehicles.add(new Bike("BIKE456", 500, "B-INS-002"));
        vehicles.add(new Truck("TRUCK789", 2000, "T-INS-003"));

        RentalUtils.printRentalAndInsurance(vehicles, 5);
    }
}
