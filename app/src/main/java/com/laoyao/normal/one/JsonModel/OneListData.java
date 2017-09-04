package com.laoyao.normal.one.JsonModel;

import java.util.List;

/**
 * Created by Laoyao on 2017/9/4.
 */

public class OneListData
{
    private String id ;
    private Weather weather ;
    private String date ;
    private List<OneListContentListItem> content_list ;

    public OneListData(String id, Weather weather, String date, List<OneListContentListItem> content_list) {
        this.id = id;
        this.weather = weather;
        this.date = date;
        this.content_list = content_list;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<OneListContentListItem> getContent_list() {
        return content_list;
    }

    public void setContent_list(List<OneListContentListItem> content_list) {
        this.content_list = content_list;
    }

    @Override
    public String toString() {
        return "OneListData{" +
                "id='" + id + '\'' +
                ", weather=" + weather +
                ", date='" + date + '\'' +
                ", content_list=" + content_list +
                '}';
    }
}
