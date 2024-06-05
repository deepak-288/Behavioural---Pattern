// Main.java
public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.setValid(true);
        order.setPaymentProcessed(true);
        order.setPackaged(true);
        order.setShipped(true);

        OrderHandler validationHandler = new ValidationHandler();
        OrderHandler paymentHandler = new PaymentHandler();
        OrderHandler packagingHandler = new PackagingHandler();
        OrderHandler shippingHandler = new ShippingHandler();

        validationHandler.setNextHandler(paymentHandler);
        paymentHandler.setNextHandler(packagingHandler);
        packagingHandler.setNextHandler(shippingHandler);

        try {
            validationHandler.handle(order);
            System.out.println("Order processed successfully.");
        } catch (OrderProcessingException e) {
            System.err.println("Order processing failed: " + e.getMessage());
        }
    }
}
