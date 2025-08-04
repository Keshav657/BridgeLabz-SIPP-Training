package Inheritance;

import java.time.LocalDate;

// Base class
class Order {
    protected String orderId;
    protected LocalDate orderDate;

    public Order(String orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed";
    }
}

// Subclass
class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(String orderId, LocalDate orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped, Tracking Number: " + trackingNumber;
    }
}

// Subclass extending ShippedOrder
class DeliveredOrder extends ShippedOrder {
    private LocalDate deliveryDate;

    public DeliveredOrder(String orderId, LocalDate orderDate, String trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}

// Demo
public class OnlineRetailOrder {
    public static void main(String[] args) {
        Order o1 = new Order("ORD123", LocalDate.of(2025, 8, 1));
        ShippedOrder o2 = new ShippedOrder("ORD124", LocalDate.of(2025, 8, 2), "TRK5678");
        DeliveredOrder o3 = new DeliveredOrder("ORD125", LocalDate.of(2025, 8, 3), "TRK9101", LocalDate.of(2025, 8, 5));

        System.out.println("Order 1 Status: " + o1.getOrderStatus());
        System.out.println("Order 2 Status: " + o2.getOrderStatus());
        System.out.println("Order 3 Status: " + o3.getOrderStatus());
    }
}
