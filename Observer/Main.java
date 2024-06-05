// Main.java
public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();

        Observer investor1 = new Investor("Alice");
        Observer investor2 = new Investor("Bob");

        stock.attach(investor1);
        stock.attach(investor2);

        try {
            stock.setPrice(100.0f);
            stock.setPrice(105.5f);
            stock.setPrice(-1.0f); // This will trigger an exception
        } catch (ObserverException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
