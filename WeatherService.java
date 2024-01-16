package weather;

public class WeatherService {
private int temperature;
private WeatherApiClient weatherApi;
public WeatherService(WeatherApiClient weatherApi) {
	this.weatherApi = weatherApi;
}

public String getCurrentWeather() {
	return weatherApi.getCurrentWeather();
}

public String getForecast() {
	return weatherApi.getForecast();
}
}
