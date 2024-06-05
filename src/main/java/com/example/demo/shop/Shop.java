package com.example.demo.shop;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Shop {

    private final int idProduct;
    private final String title;

    public Shop(int idProduct, String title) {
        this.idProduct = idProduct;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getIdProduct() {
        return idProduct;
    }
}
