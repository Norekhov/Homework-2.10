package com.example.demo.storage;

import com.example.demo.shop.Shop;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ShopStorage {
    private final Map<Integer, Shop> shopMap = new HashMap<>();

    public Shop get(int idProduct) {
        return shopMap.get(idProduct);
    }

    @PostConstruct
    public void init() {
        int idProduct = 1;
        shopMap.put(idProduct, new Shop(idProduct++, "Яблоки"));
        shopMap.put(idProduct, new Shop(idProduct++, "Клубника"));
        shopMap.put(idProduct, new Shop(idProduct++, "Груша"));
        shopMap.put(idProduct, new Shop(idProduct++, "Огурцы"));
        shopMap.put(idProduct, new Shop(idProduct++, "Помидоры"));
        shopMap.put(idProduct, new Shop(idProduct++, "Капуста"));
    }

}

