import java.util.ArrayList;
import java.util.List;

// Abstract base class for all warehouse items
abstract class WarehouseItem {
    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getDetails();
}

// Electronics item
class Electronics extends WarehouseItem {
    private String brand;

    public Electronics(String name, String brand) {
        super(name);
        this.brand = brand;
    }

    @Override
    public String getDetails() {
        return "Electronics: " + getName() + ", Brand: " + brand;
    }
}

// Groceries item
class Groceries extends WarehouseItem {
    private String expiryDate;

    public Groceries(String name, String expiryDate) {
        super(name);
        this.expiryDate = expiryDate;
    }

    @Override
    public String getDetails() {
        return "Groceries: " + getName() + ", Expiry: " + expiryDate;
    }
}

// Furniture item
class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String name, String material) {
        super(name);
        this.material = material;
    }

    @Override
    public String getDetails() {
        return "Furniture: " + getName() + ", Material: " + material;
    }
}

// Generic storage class
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public T getItem(int index) {
        return items.get(index);
    }

    public List<T> getAllItems() {
        return items;
    }
}

// Wildcard method to display any type of WarehouseItem
class WarehouseUtils {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getDetails());
        }
    }
}

// Example usage
public class warehouse {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", "Dell"));
        electronicsStorage.addItem(new Electronics("Smartphone", "Samsung"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apple", "2025-08-10"));
        groceriesStorage.addItem(new Groceries("Milk", "2025-08-05"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", "Wood"));
        furnitureStorage.addItem(new Furniture("Table", "Metal"));

        System.out.println("Electronics:");
        WarehouseUtils.displayItems(electronicsStorage.getAllItems());

        System.out.println("\nGroceries:");
        WarehouseUtils.displayItems(groceriesStorage.getAllItems());

        System.out.println("\nFurniture:");
        WarehouseUtils.displayItems(furnitureStorage.getAllItems());
    }
}
