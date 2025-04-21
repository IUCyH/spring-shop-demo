package com.iucyh.shop_demo.service;

import com.iucyh.shop_demo.dto.UserDto;
import com.iucyh.shop_demo.entity.User;
import com.iucyh.shop_demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserDto getUser(Long id) {
        User user = userRepository.getReferenceById(id);
        return new UserDto(user);
    }
}
