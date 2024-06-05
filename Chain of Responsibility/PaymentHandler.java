// ValidationHandler.java
public class ValidationHandler implements OrderHandler {
    private OrderHandler nextHandler;

    @Override
    public void setNextHandler(OrderHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handle(Order order) throws OrderProcessingException {
        if (order.isValid()) {
            System.out.println("Order validation passed.");
            if (nextHandler != null) {
                nextHandler.handle(order);
            }
        } else {
            throw new OrderProcessingException("Order validation failed.");
        }
    }
}

// PaymentHandler.java
public class PaymentHandler implements OrderHandler {
    private OrderHandler nextHandler;

    @Override
    public void setNextHandler(OrderHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handle(Order order) throws OrderProcessingException {
        if (order.isPaymentProcessed()) {
            System.out.println("Payment processing completed.");
            if (nextHandler != null) {
                nextHandler.handle(order);
            }
        } else {
            throw new OrderProcessingException("Payment processing failed.");
        }
    }
}

// PackagingHandler.java
public class PackagingHandler implements OrderHandler {
    private OrderHandler nextHandler;

    @Override
    public void setNextHandler(OrderHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handle(Order order) throws OrderProcessingException {
        if (order.isPackaged()) {
            System.out.println("Order packaging completed.");
            if (nextHandler != null) {
                nextHandler.handle(order);
            }
        } else {
            throw new OrderProcessingException("Order packaging failed.");
        }
    }
}

// ShippingHandler.java
public class ShippingHandler implements OrderHandler {

    @Override
    public void setNextHandler(OrderHandler handler) {
    }

    @Override
    public void handle(Order order) throws OrderProcessingException {
        if (order.isShipped()) {
            System.out.println("Order shipping completed.");
        } else {
            throw new OrderProcessingException("Order shipping failed.");
        }
    }
}
