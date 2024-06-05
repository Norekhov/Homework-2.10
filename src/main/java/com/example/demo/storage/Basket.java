package com.example.demo.storage;

import com.example.demo.shop.Shop;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SessionScope
@Component
public class Basket {

    private final List<Shop> shops = new ArrayList<>();

    public void add(List<Shop> shops) {
        this.shops.addAll(shops);
    }

    public List<Shop> get() {
        return Collections.unmodifiableList(shops);
    }
}
