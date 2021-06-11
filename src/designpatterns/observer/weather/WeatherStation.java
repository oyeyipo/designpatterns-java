package designpatterns.observer.weather;

public class WeatherStation {
    public static void main(String[] args) throws Exception {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForcastDisplay forcastDisplay = new ForcastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(90, 74, 3f);
        weatherData.setMeasurements(83, 34, 2f);
        weatherData.setMeasurements(45, 75, 2f);
    }
}
