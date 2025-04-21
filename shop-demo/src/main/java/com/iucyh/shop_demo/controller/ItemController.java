package com.iucyh.shop_demo.controller;

import com.iucyh.shop_demo.dto.ItemDto;
import com.iucyh.shop_demo.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/{itemId}")
    public ItemDto getItem(@PathVariable Long itemId) {
        return itemService.getItemById(itemId);
    }

    @PostMapping
    public void saveItem(ItemDto item) {
        itemService.save(item);
    }
}
