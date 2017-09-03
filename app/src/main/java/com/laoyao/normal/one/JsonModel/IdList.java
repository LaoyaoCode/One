package com.laoyao.normal.one.JsonModel;

import java.util.List;

/**
 * Created by Laoyao on 2017/9/3.
 */

public class IdList
{
    private String res ;
    private List<String> data ;

    public IdList(String res, List<String> data) {
        this.res = res;
        this.data = data;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}
