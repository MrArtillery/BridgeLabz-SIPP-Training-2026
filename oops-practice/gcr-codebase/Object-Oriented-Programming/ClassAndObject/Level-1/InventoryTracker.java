class Item {

    String itemCode;
    String itemName;
    double price;

    // Constructor
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : ₹" + price);
    }

    // Method to calculate total cost
    public double calculateTotalCost(int quantity) {
        return quantity * price;
    }
}

public class InventoryTracker {

    public static void main(String[] args) {

        Item item = new Item("IT101", "Laptop", 55000);

        int quantity = 2;

        item.displayDetails();

        System.out.println("Quantity  : " + quantity);
        System.out.println("Total Cost: ₹" + item.calculateTotalCost(quantity));
    }
}
