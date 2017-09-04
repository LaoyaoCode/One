package com.laoyao.normal.one.JsonModel;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Laoyao on 2017/9/4.
 */

public class OneList
{
    private String res ;
    private OneListData data ;

    public OneList()
    {

    }
    public OneList(String res, OneListData data) {
        this.res = res;
        this.data = data;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public OneListData getData() {
        return data;
    }

    public void setData(OneListData data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "OneList{" +
                "res='" + res + '\'' +
                ", data=" + data +
                '}';
    }
}
