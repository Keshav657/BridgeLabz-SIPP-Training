class Ride {
    double distance; 
    int time;        

    public Ride(double distance, int time) {
        this.distance = distance;
        this.time = time;
    }

    public double calculateFare() {
        double fare = (distance * 10) + (time * 1);
        return Math.max(fare,5);
    }

    public double multipleRidesFare(int rides) {
        Double totalFare = 0.0;
        for (int i = 0; i < rides; i++) {
            totalFare += calculateFare();
        }
        return totalFare;
    }

    // Add this main method
    public static void main(String[] args) {
        Ride ride = new Ride(2.5, 7);
        System.out.println("Total Fare: Rs. " + ride.calculateFare());
    }
}