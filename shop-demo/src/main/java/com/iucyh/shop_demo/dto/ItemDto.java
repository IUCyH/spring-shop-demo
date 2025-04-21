package com.iucyh.shop_demo.dto;

import com.iucyh.shop_demo.entity.Item;
import lombok.Getter;

@Getter
public class ItemDto {

    private String name;
    private Double price;

    public ItemDto(Item item) {
        this.name = item.getName();
        this.price = item.getPrice();
    }
}
