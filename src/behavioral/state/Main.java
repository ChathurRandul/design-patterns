package behavioral.state;

/*
Allows an object to change its behavior when its internal state changes, appearing to change its class.
This pattern is useful for managing complex state-dependent behavior without using large conditional statements.
*/

// Usage
public class Main {
    public static void main(String[] args) {
        Device device = new Device(new OffState());

        device.pressButton(); // The device is turned off.

        device.setState(new OnState());
        device.pressButton(); // The device is turned on.

        device.setState(new StandbyState());
        device.pressButton(); // The device is in standby mode.
    }
}
