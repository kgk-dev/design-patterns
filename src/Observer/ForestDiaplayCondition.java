package Observer;

public class ForestDiaplayCondition implements Observer, DisplayElement{
    private float temp;
    private float humidity;
    private float pressure;
    private WeatherData wData;

    public ForestDiaplayCondition(WeatherData wData) {
        this.wData = wData;
        wData.register(this);
    }

    @Override
    public void display() {
        System.out.println("Forest condition: " +
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
