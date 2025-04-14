package com.iucyh.shop_demo.service;

import com.iucyh.shop_demo.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUser(int id) {
        return new User(id, "abc123", "lucy", "abc@abc", "abc123");
    }
}
