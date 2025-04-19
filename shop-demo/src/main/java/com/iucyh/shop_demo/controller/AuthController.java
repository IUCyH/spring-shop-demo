package com.iucyh.shop_demo.controller;

import com.iucyh.shop_demo.entity.User;
import com.iucyh.shop_demo.repository.auth.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class AuthController {

    private final UserRepository userRepository;

    public void save(String username, String password) {
        User user = new User();
        userRepository.save(user);
    }
}
