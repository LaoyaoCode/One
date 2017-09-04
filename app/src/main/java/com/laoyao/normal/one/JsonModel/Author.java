package com.laoyao.normal.one.JsonModel;

/**
 * Created by Laoyao on 2017/9/4.
 */

public class Author
{
    private String user_id ;
    private String user_name ;
    private String desc ;
    private String wb_name ;
    private String is_settled ;
    private String settled_type ;
    private String summary ;
    private String fans_total ;
    private String web_url ;

    public Author(String user_id, String user_name,
                  String desc, String wb_name,
                  String is_settled, String settled_type,
                  String summary, String fans_total, String web_url) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.desc = desc;
        this.wb_name = wb_name;
        this.is_settled = is_settled;
        this.settled_type = settled_type;
        this.summary = summary;
        this.fans_total = fans_total;
        this.web_url = web_url;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getWb_name() {
        return wb_name;
    }

    public void setWb_name(String wb_name) {
        this.wb_name = wb_name;
    }

    public String getIs_settled() {
        return is_settled;
    }

    public void setIs_settled(String is_settled) {
        this.is_settled = is_settled;
    }

    public String getSettled_type() {
        return settled_type;
    }

    public void setSettled_type(String settled_type) {
        this.settled_type = settled_type;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getFans_total() {
        return fans_total;
    }

    public void setFans_total(String fans_total) {
        this.fans_total = fans_total;
    }

    public String getWeb_url() {
        return web_url;
    }

    public void setWeb_url(String web_url) {
        this.web_url = web_url;
    }

    @Override
    public String toString() {
        return "Author{" +
                "user_id='" + user_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", desc='" + desc + '\'' +
                ", wb_name='" + wb_name + '\'' +
                ", is_settled='" + is_settled + '\'' +
                ", settled_type='" + settled_type + '\'' +
                ", summary='" + summary + '\'' +
                ", fans_total='" + fans_total + '\'' +
                ", web_url='" + web_url + '\'' +
                '}';
    }
}
