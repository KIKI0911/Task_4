package com.information.country;

public class WeatherAndTemperature {
    private final String typeOfWeather;
    private final int temperature;

    public WeatherAndTemperature(String typeOfWeather, int temperature) {
        this.typeOfWeather = typeOfWeather;
        this.temperature = temperature;
    }

    public String getTypeOfWeather() {
        return typeOfWeather;
    }

    public int getTemperature() {
        return temperature;
    }
}
