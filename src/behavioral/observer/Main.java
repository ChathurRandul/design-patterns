package behavioral.observer;

//  Defines a one-to-many relationship between objects. When one object changes state, all its dependents (observers) are notified and updated automatically.

// Usage
public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Display display1 = new Display(weatherStation);
        Display display2 = new Display(weatherStation);

        weatherStation.setTemperature(25);  // Both displays will be updated
        weatherStation.setTemperature(30);  // Both displays will be updated again
    }
}
