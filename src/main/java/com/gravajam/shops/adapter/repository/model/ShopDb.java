package com.gravajam.shops.adapter.repository.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.gravajam.shops.domain.entity.Shop;

@Entity
public class ShopDb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String location;
    private String urlImage;

    public ShopDb() {
    }

    public ShopDb(Integer id, String name, String location, String urlImage) {
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

    public String getlocation() {
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
        return new Shop(this.getId(), this.getName(), this.getlocation(), this.getUrlImage());
    }

    public static ShopDb toShopDb (Shop shop){
        ShopDb shopDb = new ShopDb();

        shopDb.setId(shop.getId());
        shopDb.setName(shop.getName());
        shopDb.setLocation(shop.getLocation());
        shopDb.setUrlImage(shop.getUrlImage());

        return shopDb;
    }

}
