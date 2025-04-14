package com.iucyh.shop_demo.service;

import com.iucyh.shop_demo.domain.User;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class UserServiceTest {

    private UserService userService = new UserService();

    @Test
    void getUser() {
        User user = userService.getUser(10);
        int id = user.getId();
        assertThat(id).isEqualTo(10);
    }
}
