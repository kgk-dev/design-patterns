package Observer;

public class ObserverDemo {
    public static void main(String[] args) {
        WeatherData weathearData = new WeatherData();
        Observer currentConditon = new CurrentDisplayCondition(weathearData);
        Observer forestCondition = new ForestDiaplayCondition(weathearData);
        weathearData.setMeasurement(100, 200, 300);
    }
}
