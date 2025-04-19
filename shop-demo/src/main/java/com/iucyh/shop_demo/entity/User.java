package com.iucyh.shop_demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 64)
    private String uid;

    @Column(nullable = false, length = 10)
    private String username;

    @Column(length = 128)
    private String email;

    @Column(nullable = false, length = 64)
    private String password;

    @Column(length = 10)
    private String gender;

    @Column
    private Integer age;
}
