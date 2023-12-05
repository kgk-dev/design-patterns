package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer o) {
observers.add(o);
    }

    @Override
    public void remove(Observer o) {
observers.remove(o);
    }

    @Override
    public void noti() {
        for (Observer o :
                observers) {
            o.update(temp, humidity, pressure);
        }
    }
    public void measurementsChanged() {
        noti();
    }

    public void setMeasurement(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
