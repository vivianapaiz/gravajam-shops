package com.gravajam.shops.adapter.controller.model;

import com.gravajam.shops.domain.entity.Shop;

public class ShopRequest {
    private Integer id;
    private String name;
    private String location;
    private String urlImage;

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

    public Shop toShop(){
        return new Shop(this.getId(), this.getName(), this.getLocation(), this.getUrlImage());
    }

    public static ShopRequest tShopRequest (Shop shop){
        ShopRequest shopRequest = new ShopRequest();

        shopRequest.setId(shop.getId());
        shopRequest.setName(shop.getName());
        shopRequest.setLocation(shop.getLocation());
        shopRequest.setUrlImage(shop.getUrlImage());

        return shopRequest;
    }
}
