package behavioral.state;

// Context
public class Device {
    private State state;

    public Device(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void pressButton() {
        state.handleRequest();
    }
}