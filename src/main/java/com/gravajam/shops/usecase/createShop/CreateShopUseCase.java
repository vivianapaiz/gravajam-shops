package com.gravajam.shops.usecase.createShop;

import com.gravajam.shops.domain.entity.Shop;
import com.gravajam.shops.adapter.controller.model.ShopRequest;

public interface CreateShopUseCase {
    
    public Shop registerShop(ShopRequest request);
    
}
