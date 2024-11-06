package behavioral.state;

// Concrete state
public class OffState implements State {
    @Override
    public void handleRequest() {
        System.out.println("The device is turned off.");
    }
}
