package com.iucyh.shop_demo.service;

import com.iucyh.shop_demo.dto.UserDto;
import com.iucyh.shop_demo.entity.User;
import com.iucyh.shop_demo.repository.auth.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.*;

public class UserServiceTest {

    @Mock
    private UserRepository userRepository;
    @InjectMocks
    private UserService userService;

    @Test
    void getUser() {
        UserDto user = userService.getUser(10L);
        Long id = user.getId();
        assertThat(id).isEqualTo(10);
    }
}
