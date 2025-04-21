package com.iucyh.shop_demo.repository;

import com.iucyh.shop_demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
