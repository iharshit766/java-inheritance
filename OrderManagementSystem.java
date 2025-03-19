class Order {
    protected String orderId;
    protected String orderDate;

    // Constructor to initialize orderId and orderDate
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get order status
    public String getOrderStatus() {
        return "Order placed";
    }

    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
    }
}

class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped";
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered";
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

// Example usage
public class OrderManagementSystem {
    public static void main(String[] args) {
        Order order = new Order("ORD123", "2025-03-19");
        ShippedOrder shippedOrder = new ShippedOrder("ORD124", "2025-03-18", "TRK56789");
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD125", "2025-03-17", "TRK12345", "2025-03-20");

        order.displayOrderDetails();
        System.out.println();
        shippedOrder.displayOrderDetails();
        System.out.println();
        deliveredOrder.displayOrderDetails();
    }
}
