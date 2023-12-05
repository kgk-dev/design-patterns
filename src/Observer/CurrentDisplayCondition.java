package Observer;

public class CurrentDisplayCondition implements Observer, DisplayElement{
    private float temp;
    private float humidity;
    private float pressure;
    private WeatherData wData;

    public CurrentDisplayCondition(WeatherData wData) {
this.wData = wData;
wData.register(this);
    }

    @Override
    public void display() {
        System.out.println("Current condition: " +
                temp + "F degress, " + humidity + " and pressure" + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
this.temp = temp;
this.humidity = humidity;
this.pressure = pressure;
display();
    }
}
