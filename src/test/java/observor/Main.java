package observor;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData =new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasureMents(80,3,5);
        weatherData.setMeasureMents(81,3,5);
        weatherData.setMeasureMents(82,3,5);
        weatherData.setMeasureMents(83,3,5);
    }
}

