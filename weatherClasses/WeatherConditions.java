package com.group.weatherforecast;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class WeatherConditions {
    int id;
    String name;
    @SerializedName("main")
    Map<String, Float> measurements;
    Sys sys;

    public String toString() {
        return "WeatherConditions{" +
                "id=" + id +
                ", name='" + name + ", " + sys.country + "\'" +
                ", measurements =" + measurements +
                '}';
    }

    public String display() {
        return "The temperature in " + name + ", " + sys.getCountry() +
                " is " + (measurements.get("temp") - 273.15) + "°C";
    }

    public int getCelsiusTemp() {
        return (int)Math.round((measurements.get("temp") - 273.15));
    }
}
