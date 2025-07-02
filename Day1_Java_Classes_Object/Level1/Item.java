package Day1_Java_Classes_Object.Level1;

class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item = new Item(101, "USB Drive", 12.50);
        item.displayItemDetails();
        int quantity = 4;
        System.out.println("Total Cost for " + quantity + " units: $" + item.calculateTotalCost(quantity));
    }
}
