package com.group.weatherforecast;

import java.util.List;

public class WeatherForecast {
    List<WeatherForecastItem> list; // 3 Hour Blocks
    City city;

    @Override
    public String toString() {
        return "WeatherForecast{" +
                ", list=" + list +
                ", city=" + city +
                '}';
    }

    public List<WeatherForecastItem> getList() {
        return list;
    }

    public City getCity() {
        return city;
    }
}
