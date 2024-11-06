package behavioral.state;

// Concrete state
public class StandbyState implements State {
    @Override
    public void handleRequest() {
        System.out.println("The device is in standby mode.");
    }
}