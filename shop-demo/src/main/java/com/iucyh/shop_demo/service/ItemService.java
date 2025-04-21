package com.iucyh.shop_demo.service;

import com.iucyh.shop_demo.dto.ItemDto;
import com.iucyh.shop_demo.entity.Item;
import com.iucyh.shop_demo.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemDto getItemById(Long id) {
        Item item = itemRepository.getReferenceById(id);
        return new ItemDto(item);
    }

    public void save(ItemDto item) {
        Item newItem = new Item();
        newItem.setName(item.getName());
        newItem.setPrice(item.getPrice());

        itemRepository.save(newItem);
    }
}
