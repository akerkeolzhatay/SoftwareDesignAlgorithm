// Main.java
public class Main {
    public static void main(String[] args) {
        TransportFactory factory;

        // User selects "water delivery"
        factory = new SeaTransportFactory();
        Transport transport = factory.createTransport();
        transport.deliver();
    }
}
