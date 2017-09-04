package com.laoyao.normal.one.JsonModel;

/**
 * Created by Laoyao on 2017/9/4.
 */

public class ShareInfo
{
    private String url ;
    private String image ;
    private String title ;
    private String content ;

    public ShareInfo(String url, String image, String title, String content) {
        this.url = url;
        this.image = image;
        this.title = title;
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ShareInfo{" +
                "url='" + url + '\'' +
                ", image='" + image + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
