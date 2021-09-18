package com.gravajam.shops.domain.port;

import com.gravajam.shops.domain.entity.Shop;
import java.util.List;

public interface ShopRepository {

    public Shop create(Shop shop);
    public List<Shop> findAllShops();
}
