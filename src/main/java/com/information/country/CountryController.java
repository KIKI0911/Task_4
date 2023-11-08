package com.information.country;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {
    @GetMapping("/country")
    public Country getCountry() {
        return new Country("America",
            List.of(
                new ProvinceAndState("Colombia", 52176307),
                new ProvinceAndState("Texas", 30029572),
                new ProvinceAndState("Chicago", 2746388)
            ),
            List.of(
                new WeatherAndTemperature("rainy", 10),
                new WeatherAndTemperature("sunny", 25),
                    new WeatherAndTemperature("cloudy",13)
            )
        );
    }
}
