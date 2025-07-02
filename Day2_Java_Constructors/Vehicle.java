package Day2_Java_Constructors;

class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 500.00;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle: " + vehicleType + ", Registration Fee: $" + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("John", "Car");
        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(600.00);
        Vehicle v2 = new Vehicle("Alice", "Bike");
        v2.displayVehicleDetails();
    }
}

