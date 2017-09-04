package com.laoyao.normal.one.JsonModel;

/**
 * Created by Laoyao on 2017/9/4.
 */

public class Weather
{
    private String city_name ;
    private String date ;
    private int temperature ;
    private int humidity ;
    private String climate ;
    private String wind_direction ;
    private String hurricane ;
    private WeatherIcons icons ;

    public Weather()
    {

    }

    public Weather(String city_name, String date,
                   int temperature, int humidity,
                   String climate, String wind_direction,
                   String hurricane, WeatherIcons icons)
    {
        this.city_name = city_name;
        this.date = date;
        this.temperature = temperature;
        this.humidity = humidity;
        this.climate = climate;
        this.wind_direction = wind_direction;
        this.hurricane = hurricane;
        this.icons = icons;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getWind_direction() {
        return wind_direction;
    }

    public void setWind_direction(String wind_direction) {
        this.wind_direction = wind_direction;
    }

    public String getHurricane() {
        return hurricane;
    }

    public void setHurricane(String hurricane) {
        this.hurricane = hurricane;
    }

    public WeatherIcons getIcons() {
        return icons;
    }

    public void setIcons(WeatherIcons icons) {
        this.icons = icons;
    }

    public static class WeatherIcons
    {
        private String day ;
        private String night ;

        public WeatherIcons()
        {

        }

        public WeatherIcons(String day, String night) {
            this.day = day;
            this.night = night;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public String getNight() {
            return night;
        }

        public void setNight(String night) {
            this.night = night;
        }
    }

    @Override
    public String toString() {
        return "Weather{" +
                "city_name='" + city_name + '\'' +
                ", date='" + date + '\'' +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", climate='" + climate + '\'' +
                ", wind_direction='" + wind_direction + '\'' +
                ", hurricane='" + hurricane + '\'' +
                ", icons=" + icons +
                '}';
    }
}
