package com.shop.UserService.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.management.relation.Role;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "onlineusers" )
public class Users {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id ;

    @Column(nullable = false,unique = true)
    private  String username;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;




public enum Role{
    Buyer,
    Serller,
    Admin

}

}
