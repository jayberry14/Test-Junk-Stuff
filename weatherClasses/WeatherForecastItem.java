package com.group.weatherforecast;

import java.util.List;
import java.util.Map;

public class WeatherForecastItem {
    int dt;
    Map<String, Float> main;
    List<Weather> weather;
    Map<String, Float> clouds;
    Map<String, Float> wind;
    String dt_txt;

    @Override
    public String toString() {
        return "WeatherForecastItem{" +
                "dt=" + dt +
                ", main=" + main +
                ", weather=" + weather +
                ", clouds=" + clouds +
                ", wind=" + wind +
                ", dt_txt='" + dt_txt + '\'' +
                '}';
    }

    public int getDt() {
        return dt;
    }

    public Map<String, Float> getMain() {
        return main;
    }

    public double getCelsiusTemp() {
        return main.get("temp") - 273.15;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public Map<String, Float> getClouds() {
        return clouds;
    }

    public Map<String, Float> getWind() {
        return wind;
    }

    public String getDt_txt() {
        return dt_txt;
    }
}
