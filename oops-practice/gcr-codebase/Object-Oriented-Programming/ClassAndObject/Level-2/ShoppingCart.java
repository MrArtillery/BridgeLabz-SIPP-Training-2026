class CartItem {

    String itemName;
    double price;
    int quantity;

    // Constructor
    public CartItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = 0;
    }

    // Method to add items
    public void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " item(s) added to cart.");
    }

    // Method to remove items
    public void removeItem(int qty) {

        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " item(s) removed from cart.");
        } else {
            System.out.println("Cannot remove more items than available.");
        }
    }

    // Method to display total cost
    public void displayTotalCost() {

        double totalCost = price * quantity;

        System.out.println("\nItem Name : " + itemName);
        System.out.println("Price     : ₹" + price);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Total Cost: ₹" + totalCost);
    }
}

public class ShoppingCart {

    public static void main(String[] args) {

        CartItem item = new CartItem("Laptop", 55000);

        item.addItem(2);

        item.removeItem(1);

        item.displayTotalCost();
    }
}
