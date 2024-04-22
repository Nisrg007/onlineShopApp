package com.tooglamtogivedamn.onlineshopapp.Domain;

public class SliderItems {
    private String url;

    public SliderItems() {
        // Required default constructor for Firebase deserialization
    }

    public SliderItems(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
