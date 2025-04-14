package com.iucyh.shop_demo.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class User {
    private final int id;
    private final String uid;
    private final String username;
    private final String email;
    private final String password;
    private String gender;
    private String age;
}
