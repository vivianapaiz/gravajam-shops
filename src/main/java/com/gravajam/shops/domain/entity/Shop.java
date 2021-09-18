package com.gravajam.shops.domain.entity;

public class Shop {
    private Integer id;
    private String name;
    private String location;
    private String urlImage;

    public Shop() {
    }

    public Shop(Integer id, String name, String location, String urlImage) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.urlImage = urlImage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
