package com.gravajam.shops.adapter.repository;

import java.util.List;
import java.util.stream.Collectors;

import com.gravajam.shops.adapter.repository.model.ShopDb;
import com.gravajam.shops.domain.entity.Shop;
import com.gravajam.shops.domain.port.ShopRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShopRepositoryImpl  implements ShopRepository{


    @Autowired
    private JpaShopRepository repo;

    @Override
    public Shop create(Shop shop) {
        ShopDb shopSaved = repo.save(ShopDb.toShopDb(shop));
        return shopSaved.toShop();
    }

    @Override
    public List<Shop> findAllShops() {
        return repo.findAll().stream().map(ShopDb::toShop)
        .collect(Collectors.toList());
    }
    
}
