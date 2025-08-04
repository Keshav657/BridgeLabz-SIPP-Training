package Encap_Poly;
import java.util.ArrayList;

// Discountable interface
interface Discountable {
    void applyDiscount(double percent);
    String getDiscountDetails();
}

// Abstract FoodItem class
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Encapsulation: Getters and Setters
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    protected void setPrice(double price) { this.price = price; }
    protected void setQuantity(int quantity) { this.quantity = quantity; }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Concrete method
    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }
}

// VegItem class
class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) - discount;
    }

    @Override
    public void applyDiscount(double percent) {
        discount = (getPrice() * getQuantity()) * percent / 100;
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Discount: ₹" + discount;
    }
}

// NonVegItem class
class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private double nonVegCharge = 30; // extra charge per item

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity() + nonVegCharge * getQuantity()) - discount;
    }

    @Override
    public void applyDiscount(double percent) {
        discount = (getPrice() * getQuantity() + nonVegCharge * getQuantity()) * percent / 100;
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Discount: ₹" + discount;
    }
}

// Utility class for polymorphism
class OrderUtils {
    public static void processOrder(ArrayList<FoodItem> items) {
        for (FoodItem item : items) {
            System.out.println(item.getItemDetails());
            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                d.applyDiscount(10); // Apply 10% discount
                System.out.println(d.getDiscountDetails());
            }
            System.out.println("Total Price: ₹" + item.calculateTotalPrice());
            System.out.println("---");
        }
    }
}

// Demo
public class OnlineFoodDelivery {
    public static void main(String[] args) {
        ArrayList<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Tikka", 200, 2));
        order.add(new NonVegItem("Chicken Biryani", 250, 3));
        OrderUtils.processOrder(order);
    }
}

