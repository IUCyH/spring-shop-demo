package com.iucyh.shop_demo.controller;

import com.iucyh.shop_demo.domain.User;
import com.iucyh.shop_demo.repository.auth.AuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class AuthController {

    private final AuthRepository authRepository;

    public void save(String username, String password) {
        User user = new User(1, "123456", username, "abc@abc", password);
        authRepository.save(user);
    }
}
