package behavioral.state;

// Concrete state
public class OnState implements State {
    @Override
    public void handleRequest() {
        System.out.println("The device is turned on.");
    }
}
