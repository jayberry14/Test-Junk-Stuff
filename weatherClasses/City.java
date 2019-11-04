package com.group.weatherforecast;

public class City {
    String name;
    String country;
    int timezone;

    @Override
    public String toString() {
        return "City{" +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", timezone=" + timezone +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getTimezone() {
        return timezone;
    }
}
