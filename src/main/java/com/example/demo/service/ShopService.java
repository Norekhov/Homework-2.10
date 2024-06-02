package com.example.demo.service;

import com.example.demo.shop.Shop;
import com.example.demo.storage.Basket;
import com.example.demo.storage.ShopStorage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {
    private final ShopStorage shopStorage;
    private final Basket basket;

    public ShopService(ShopStorage shopStorage, Basket basket) {
        this.shopStorage = shopStorage;
        this.basket = basket;
    }


    public void add(List<Integer> idProduct) {
        basket.add(idProduct.stream().map(shopStorage::get).toList());
    }

    public List<Shop> get() {
        return basket.get();
    }
}
