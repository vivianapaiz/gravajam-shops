package com.gravajam.shops.domain.usecase.findShop;

import com.gravajam.shops.domain.entity.Shop;
import java.util.List;

public interface FindShopUseCase {

    public List<Shop> findAllShops();
    
}
