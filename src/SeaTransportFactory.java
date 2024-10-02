// SeaTransportFactory.java
public class SeaTransportFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
