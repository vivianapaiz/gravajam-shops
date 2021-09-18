package com.gravajam.shops.adapter.repository;

import com.gravajam.shops.adapter.repository.model.ShopDb;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaShopRepository extends JpaRepository<ShopDb, Integer> {
    
}
