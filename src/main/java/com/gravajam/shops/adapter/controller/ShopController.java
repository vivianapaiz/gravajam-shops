package com.gravajam.shops.adapter.controller;

import com.gravajam.shops.adapter.controller.model.ShopRequest;
import com.gravajam.shops.shared.ApiResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.gravajam.shops.domain.entity.Shop;
import com.gravajam.shops.domain.usecase.createShop.CreateShopUseCase;
import com.gravajam.shops.domain.usecase.findShop.FindShopUseCase;


@RestController
public class ShopController {

    @Autowired
    private CreateShopUseCase createShopUseCase;
    @Autowired
    private FindShopUseCase findShopUseCase;
    
    @PostMapping("/shops")
    public ResponseEntity<ApiResponse> registerShop(@RequestBody ShopRequest request){
        createShopUseCase.registerShop(request);
        return new ResponseEntity<>(new ApiResponse(true, "new shop created"), HttpStatus.CREATED);
    }

    @GetMapping("/shops")
    public ResponseEntity<List<Shop>> findAllShops(){
        List<Shop> body = findShopUseCase.findAllShops();
        return new ResponseEntity<List<Shop>>(body, HttpStatus.OK);
    }
    
}
