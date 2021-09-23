package com.gravajam.shops.domain.usecase.findShop;

import java.util.List;

import com.gravajam.shops.domain.entity.Shop;
import com.gravajam.shops.domain.port.ShopRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class findShopService implements FindShopUseCase {
    @Autowired
    private ShopRepository shopRepository;

    @Override
    public List<Shop> findAllShops() {
        return shopRepository.findAllShops();
    }
    
}
