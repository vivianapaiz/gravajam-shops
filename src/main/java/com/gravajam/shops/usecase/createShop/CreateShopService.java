package com.gravajam.shops.usecase.createShop;

import com.gravajam.shops.domain.entity.Shop;
import com.gravajam.shops.domain.port.ShopRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gravajam.shops.adapter.controller.model.ShopRequest;

@Service
public class CreateShopService implements CreateShopUseCase{
    @Autowired
    private ShopRepository shopRepository;

    @Override
    public Shop registerShop(ShopRequest request) {
        return shopRepository.create(request.toShop());
    }

}
