package com.group.weatherforecast;

public class Sys {
    int type;
    float message;
    String country;
    int sunrise;
    int sunset;

    @Override
    public String toString() {
        return "Sys{" +
                "type=" + type +
                ", message=" + message +
                ", country='" + country + '\'' +
                ", sunrise=" + sunrise +
                ", sunset=" + sunset +
                '}';
    }

    public int getType() {
        return type;
    }

    public float getMessage() {
        return message;
    }

    public String getCountry() {
        return country;
    }

    public int getSunrise() {
        return sunrise;
    }

    public int getSunset() {
        return sunset;
    }
}
