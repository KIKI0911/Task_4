package com.information.country;

public class ProvinceAndState {
    private final String provinceAndStateName;
    private final int population;

    public ProvinceAndState(String provinceAndStateName, int population) {
        this.provinceAndStateName = provinceAndStateName;
        this.population = population;
    }

    public String getProvinceAndStateName() {
        return provinceAndStateName;
    }

    public int getPopulation() {
        return population;
    }
}
