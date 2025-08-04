package Encap_Poly;
import java.util.ArrayList;

// Taxable interface
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract Product class
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Encapsulation: Getters and Setters
    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public void setName(String name) { this.name = name; }

    // Abstract method
    public abstract double calculateDiscount();
}

// Electronics class
class Electronics extends Product implements Taxable {
    private double discountRate;

    public Electronics(int productId, String name, double price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate / 100;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "Electronics GST: 18%";
    }
}

// Clothing class
class Clothing extends Product implements Taxable {
    private double discountAmount;

    public Clothing(int productId, String name, double price, double discountAmount) {
        super(productId, name, price);
        this.discountAmount = discountAmount;
    }

    @Override
    public double calculateDiscount() {
        return discountAmount;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% GST
    }

    @Override
    public String getTaxDetails() {
        return "Clothing GST: 5%";
    }
}

// Groceries class (no tax)
class Groceries extends Product {
    private double discount;

    public Groceries(int productId, String name, double price, double discount) {
        super(productId, name, price);
        this.discount = discount;
    }

    @Override
    public double calculateDiscount() {
        return discount;
    }
}

// Utility method for polymorphism
class ECommerceUtils {
    public static void printFinalPrice(ArrayList<Product> products) {
        for (Product p : products) {
            double tax = 0;
            if (p instanceof Taxable) {
                tax = ((Taxable)p).calculateTax();
                System.out.println(((Taxable)p).getTaxDetails());
            }
            double discount = p.calculateDiscount();
            double finalPrice = p.getPrice() + tax - discount;
            System.out.println("Product: " + p.getName() + ", Final Price: " + finalPrice);
        }
    }
}

// Demo
public class ECommercePlatform {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Electronics(1, "Smartphone", 20000, 10));
        products.add(new Clothing(2, "T-Shirt", 500, 50));
        products.add(new Groceries(3, "Rice", 1000, 100));
        ECommerceUtils.printFinalPrice(products);
    }
}
        
