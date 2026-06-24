class Order {

    protected int orderId;
    protected String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {

    protected String trackingNumber;

    public ShippedOrder(int orderId,
                        String orderDate,
                        String trackingNumber) {

        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {

    private String deliveryDate;

    public DeliveredOrder(int orderId,
                          String orderDate,
                          String trackingNumber,
                          String deliveryDate) {

        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }

    public void displayInfo() {

        System.out.println("Order ID       : " + orderId);
        System.out.println("Order Date     : " + orderDate);
        System.out.println("Tracking No.   : " + trackingNumber);
        System.out.println("Delivery Date  : " + deliveryDate);
        System.out.println("Status         : " + getOrderStatus());
    }
}

public class OnlineRetailOrderManagement {

    public static void main(String[] args) {

        DeliveredOrder order =
                new DeliveredOrder(
                        101,
                        "15-06-2026",
                        "TRK12345",
                        "18-06-2026");

        order.displayInfo();
    }
}
