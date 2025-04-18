package com.iucyh.shop_demo.repository.auth;

import com.iucyh.shop_demo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MemoryAuthRepository implements AuthRepository {

    private static final Map<Long, User> userRepository = new HashMap<>();
    private static Long sequnce = 1L;

    @Override
    public void save(User user) {
        Long id = ++sequnce;
        userRepository.put(id, user);
    }
}
