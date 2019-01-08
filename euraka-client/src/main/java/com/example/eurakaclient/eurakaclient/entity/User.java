package com.example.eurakaclient.eurakaclient.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String userName;
    private String email;
    private String phone;
}
