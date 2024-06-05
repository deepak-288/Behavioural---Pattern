// OrderHandler.java
public interface OrderHandler {
    void setNextHandler(OrderHandler handler);
    void handle(Order order) throws OrderProcessingException;
}
