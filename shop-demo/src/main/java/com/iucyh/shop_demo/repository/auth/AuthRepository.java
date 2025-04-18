package com.iucyh.shop_demo.repository.auth;

import com.iucyh.shop_demo.domain.User;

public interface AuthRepository {

    void save(User user);
}
