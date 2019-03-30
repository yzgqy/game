import observor.CurrentConditionsDisplay;
import observor.WeatherData;

public class Test1 {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);

    }

}
