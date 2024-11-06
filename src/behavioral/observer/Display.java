package behavioral.observer;

// Concrete observer
public class Display implements Observer {
    private WeatherStation station;

    public Display(WeatherStation station) {
        this.station = station;
        station.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Temperature updated to: " + station.getTemperature() + " degrees");
    }
}
