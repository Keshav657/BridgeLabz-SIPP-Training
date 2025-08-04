package Inheritance;

// Superclass
class Vehicle {
    protected int maxSpeed;
    protected String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

// Refuelable interface
interface Refuelable {
    void refuel();
}

// ElectricVehicle subclass
class ElectricVehicle extends Vehicle {
    private int batteryLevel;

    public ElectricVehicle(int maxSpeed, String model, int batteryLevel) {
        super(maxSpeed, model);
        this.batteryLevel = batteryLevel;
    }

    public void charge() {
        batteryLevel = 100;
        System.out.println(model + " charged to 100%.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Electric, Battery Level: " + batteryLevel + "%");
    }
}

// PetrolVehicle subclass implements Refuelable
class PetrolVehicle extends Vehicle implements Refuelable {
    private double fuelLevel;

    public PetrolVehicle(int maxSpeed, String model, double fuelLevel) {
        super(maxSpeed, model);
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void refuel() {
        fuelLevel = 100;
        System.out.println(model + " refueled to 100%.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Petrol, Fuel Level: " + fuelLevel + "%");
    }
}

// Demo
public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(160, "Tesla Model 3", 80);
        PetrolVehicle pv = new PetrolVehicle(180, "Honda City", 50);

        ev.displayInfo();
        ev.charge();
        ev.displayInfo();

        System.out.println("---");

        pv.displayInfo();
        pv.refuel();
        pv.displayInfo();
    }
}
