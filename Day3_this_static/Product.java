package Day3_this_static;

class Product {
    private final String productID;
    private String productName;
    private double price;
    private int quantity;
    static double discount = 5.0;

    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProduct() {
        if (this instanceof Product) {
            System.out.println("ID: " + productID + ", Name: " + productName + ", Price: " + price + ", Qty: " + quantity + ", Discount: " + discount + "%");
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("P101", "Laptop", 50000, 2);
        Product p2 = new Product("P102", "Mouse", 500, 5);
        p1.displayProduct();
        p2.displayProduct();
        Product.updateDiscount(10);
        p1.displayProduct();
    }
}

