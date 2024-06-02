package com.example.demo.controller;

import com.example.demo.service.ShopService;
import com.example.demo.shop.Shop;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/order")
@RestController
public class ShopController {
    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") List<Integer> idProduct) {
        shopService.add(idProduct);
    }

    @GetMapping("/get")
    public List<Shop> get() {
        return shopService.get();
    }
}
