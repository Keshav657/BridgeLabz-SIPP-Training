package Day3_this_static;

class Vehicle {
    private final String registrationNumber;
    private String ownerName, vehicleType;
    static double registrationFee = 1500;

    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Reg No: " + registrationNumber + ", Owner: " + ownerName + ", Type: " + vehicleType + ", Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("MH12AB1234", "Karan", "Car");
        Vehicle v2 = new Vehicle("MH14XY9876", "Sneha", "Bike");
        v1.displayDetails();
        v2.displayDetails();
        Vehicle.updateRegistrationFee(2000);
        v1.displayDetails();
    }
}

