package com.iucyh.shop_demo.dto;

import com.iucyh.shop_demo.entity.User;
import lombok.Getter;

@Getter
public class UserDto {

    private Long id;
    private String username;
    private String email;
    private String gender;
    private Integer age;

    public UserDto(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.email = user.getEmail();
        this.gender = user.getGender();
        this.age = user.getAge();
    }
}
