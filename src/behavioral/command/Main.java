package behavioral.command;

//  Encapsulates a request as an object, allowing clients to parameterize objects with operations, queue requests, and support undoable operations.

// Usage
public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Command turnOn = new TurnOnCommand(light);
        Command turnOff = new TurnOffCommand(light);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(turnOn);
        remote.pressButton();  // Light is ON

        remote.setCommand(turnOff);
        remote.pressButton();  // Light is OFF
    }
}
