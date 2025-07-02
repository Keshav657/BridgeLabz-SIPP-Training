package Day2_Java_Constructors;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = 40.0;  // Fixed daily rate
    }

    double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    void displayDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("Emily", "Toyota Corolla", 5);
        rental.displayDetails();
    }
}

