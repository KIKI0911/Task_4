package com.helloworld.greet;

import java.util.List;

public class Country {
    private final String countryName;
    private final List<ProvinceAndState> provincesAndStates;
    private final List<WeatherAndTemperature> weatherAndTemperature;

    public Country(String countryName, List<ProvinceAndState> provinceAndState, List<WeatherAndTemperature> weatherAndTemperature) {
        this.countryName = countryName;
        this.provincesAndStates = provinceAndState;
        this.weatherAndTemperature = weatherAndTemperature;
    }

    public String getCountryName() {
        return countryName;
    }

    public List<ProvinceAndState> getProvincesAndStates() {
        return provincesAndStates;
    }

    public List<WeatherAndTemperature> getWeatherAndTemperature() {
        return weatherAndTemperature;
    }
}
