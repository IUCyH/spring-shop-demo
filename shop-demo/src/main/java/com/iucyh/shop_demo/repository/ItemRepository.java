package com.iucyh.shop_demo.repository;

import com.iucyh.shop_demo.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {}
