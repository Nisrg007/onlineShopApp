package com.tooglamtogivedamn.onlineshopapp.Domain;

public class CategoryDomain {
    private int id;
    private String picUrl;
    private String title;



    public CategoryDomain(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public CategoryDomain( int id,String picUrl,String title) {
        this.id = id;
        this.picUrl = picUrl;
        this.title = title;
    }
}
